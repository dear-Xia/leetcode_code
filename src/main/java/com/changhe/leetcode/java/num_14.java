package com.changhe.leetcode.java;

import com.changhe.leetcode.jianzhiOFFER.Min_11;
import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.security.acl.LastOwnerException;

/**
 *字符串数组的最长公共前缀
 */
public class num_14 {

    /**
     *使用字数组或者subString的方式完成
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length<1){
            return "";
        }else {
            String start = strs[0];
            boolean flage = true;
            for (int end = 1; end <= start.length(); end++) {
                String son = start.substring(0, end);
                for (int i = 1; i < strs.length; i++) {
                    if (!son.equals(strs[i].substring(0, end))) {
                        flage = false;
                        break;
                    }
                }
                if (flage == false) {
                    if (end == 1) {
                        result = "";
                        break;
                    } else {
                        result = start.substring(0, end - 1);
                        break;
                    }
                }
            }
            return result;
        }

    }

    /**
     * 方法一：
     *      这里可以采用横向扫描
     *      即第一个和第二个求一个最长公共前缀
     *      然后最长公共前缀和第三个求，以此类推
     * @param strs
     * @return
     */
    public static String way_1(String[] strs){
        if(strs.length<1 || strs == null)
            return "";
        String prefix = strs[0];
        int count = strs.length;
        for(int i=1;i<count;i++){
            prefix = LongestCommonPrefix(prefix,strs[i]);
            if(prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }

    /**
     * 求两个字符串最长公共前缀
     * @param str1
     * @param str2
     * @return
     */
    public static String LongestCommonPrefix(String str1,String str2){
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        while(index < length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }

    /**
     * 方法二：
     *      是一次型比较全部的数据的第一位，比较完后，在比较下一位
     *      从而得出最长串
     * @param strs
     * @return
     */
    public static String way_2(String[] strs){
        if(strs == null || strs.length<1 )
            return "";
        int length = strs[0].length();
        int count = strs.length;
        for(int i=0;i<length;i++){
            char c = strs[0].charAt(i);
            for(int j = 1;j<count;j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }

    /**
     *分治法：
     *      两两求最长公共前缀，然后不停的归并
     *      直到结束
     * @param strs
     * @return
     */
    public static String way_3(String[] strs){
        if(strs == null || strs.length <1 ){
            return "";
        }else{
            return LongestCommonPrefix_3(strs,0,strs.length-1);
        }
    }
    public static String  LongestCommonPrefix_3(String[] strs,int start,int end){
        if(start == end){
            return strs[start];
        }else{
            int mid = (end - start) / 2 + start;
            String lcpLeft = LongestCommonPrefix_3(strs,start,mid);
            String lcpRight = LongestCommonPrefix_3(strs, mid+1,end);
            return commonPrefix(lcpLeft,lcpRight);
        }
    }
    public static String commonPrefix(String str1,String str2){
        int minLength = Math.min(str1.length(),str2.length());
        for(int i=0;i<minLength;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return str1.substring(0,i);
            }
        }
        return str1.substring(0,minLength);
    }

    /**
     *二分查找：
     *
     * @param strs
     * @return
     */
    public static String way_4(String[] strs){
        if(strs == null || strs.length<1)
            return "";
        int minLength = Integer.MAX_VALUE;
        for(String str :strs){
            minLength = Math.min(minLength,str.length());
        }

        int low =0, high=minLength;
        while (low<high){
            int mid = (high-low +1)/2 +low;
            if(isComminPrefix(strs,mid)){
                low = mid;
            }else {
                high = mid - 1;
            }
        }
        return  strs[0].substring(0,low);
    }
    public static boolean isComminPrefix(String[] strs,int length){
        String str0 = strs[0].substring(0,length);
        int count = strs.length;
        for(int i=0;i<count;i++){
            String str = strs[i];
            for(int j=0;j<length;j++){
                if(str0.charAt(j) != str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        //String str = longestCommonPrefix(strs);
        String str = way_3(strs);
        System.out.println(str);
    }
}
