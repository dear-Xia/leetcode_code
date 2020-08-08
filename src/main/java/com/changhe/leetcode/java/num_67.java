package com.changhe.leetcode.java;

public class num_67 {
    /**
     * 计算俩二进制字符串的和
     * 转成十进制计算，然后转为二进制字符串
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }

    public  static  String addBinary_1(String a,String b){
        int x = Integer.parseInt(a,2);
        int y  =  Integer.parseInt(b,2);
        int answer = 0;
        int carry = 0;

        while (y>0){
            answer = x^y;
            carry = (x&y)<<1;
            x = answer;
            y = carry;
        }
        return  Integer.toBinaryString(x);
    }

    public static void main(String[] args) {
        System.out.println(addBinary_1("10","11"));
    }
}
