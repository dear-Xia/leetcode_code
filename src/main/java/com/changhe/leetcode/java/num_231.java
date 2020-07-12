package com.changhe.leetcode.java;

public class num_231 {
    /**
     * 给定整数，判断是否是2的幂
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo(int n) {

        if (n == 0) return false;
        //为什么转为long后，负数可以这样参与运算
        long x = (long) n;
        return (x & (x - 1)) == 0;

    }

    /**
     * 反码用的妙啊
     * @param n
     * @return
     */
    public  static boolean isPowerOfTwo_1(int n){
        if (n == 0)
            return false;
        return (n&(~n+1)) == n;
    }

    public static void main(String[] args) {
        boolean powerOfTwo = isPowerOfTwo_1(16);
        System.out.println(powerOfTwo);
    }
}
