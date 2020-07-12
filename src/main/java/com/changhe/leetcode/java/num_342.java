package com.changhe.leetcode.java;


public class num_342 {
    /**
     * 判断是否是4的幂
     * 先判断是2的幂次
     * 然后在判断是4的幂次
     * 4的幂次在二进制显示为偶数位，所以和计数位&为0
     * 整数32位--8位16进制数
     * @param num
     * @return
     */
    public static boolean isPowerOfFour(int num) {

        return num>0 & (num&(num-1))==0 &(num & 0Xaaaaaaaa)==0;
    }

    /**
     * 使用数学方法
     * log2（n）==>2的倍数
     * @param num
     * @return
     */
    public static boolean isPowerOfFour_1(int num){
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
