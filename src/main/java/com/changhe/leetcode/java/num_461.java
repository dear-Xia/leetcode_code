package com.changhe.leetcode.java;

public class num_461 {
    /**
     * 计算两个整数的汉明距离
     * 汉明距离的含义是两个整数的二进制数的1之间的距离
     * 两数异或得到的数
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(4,1));
    }
}
