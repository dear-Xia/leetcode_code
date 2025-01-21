package com.changhe.leetcode.java;

public class num_6 {

    /**
     * 将字符串z字形转换，然后从左到右，从上到下依次组成新的字符串
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        /**
         * 思路
         *  rownum代表了字符串数组的个数，只需要依次将数据插入到原有字符串中
         */
        int start = 0;
        int len = numRows+numRows-2;
        int end = s.length()%len;
        String[] strings = new String[numRows];
        return null;

    }
    public static void main(String[] args) {

    }
}
