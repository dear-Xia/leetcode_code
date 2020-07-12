package com.changhe.leetcode.java;

public class num_371 {
    public static int getSum(int a, int b) {
        int lower = 0;
        while (b !=0){
            lower = a ^ b;
            b = (a&b)<<1;
            a = lower;
        }

        return lower;
    }
    public static void main(String[] args) {
        System.out.println(getSum(2,-3));
    }
}
