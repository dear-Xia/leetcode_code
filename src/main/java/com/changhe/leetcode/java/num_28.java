package com.changhe.leetcode.java;

public class num_28 {

    /**
     *首先排除掉不存在的
     * 其次排除存在在开头的
     * 最后是使用切分，获得第一个字串的长度
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }else {
            if(haystack.substring(0,needle.length()).equals(needle)){
                return 0;
            }else{
                String[] split = haystack.split(needle);
                return split[0].length();
            }
        }

    }
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
}
