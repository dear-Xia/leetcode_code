package com.changhe.leetcode.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class num_389 {
    /**
     *
     * 找不同
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        char result = '0';
        for(int i=0;i<s.length();i++){
            if(map.get(chars[i]) == null){
                map.put(chars[i],1);
            }else {
                map.put(chars[i],map.get(chars[i])+1);
            }
        }

        for(int j=0;j<t.length();j++){
            if(map.get(chars1[j]) == null){
                result =  chars1[j];
                break;
            }else {
                map.put(chars1[j],map.get(chars1[j])-1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry test : entries){
            if((Integer)test.getValue()<0){
                result =  (Character) test.getKey();
                break;
            }
        }

        return result;

    }

    /**
     * 异或操作--0与其他异或得到本身，但是相同的异或为0
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference_1(String s, String t){
        char flage = 0;

        for(int i=0;i<s.length();i++){
            flage ^= s.charAt(i)^t.charAt(i);
        }
        flage^=t.charAt(s.length());
        return flage;
    }
    public static void main(String[] args) {
        String s = "";
        String t = "a";

        System.out.println(findTheDifference(s,t));

        System.out.println(findTheDifference_1(s,t));
    }
}
