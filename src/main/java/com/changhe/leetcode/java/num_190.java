package com.changhe.leetcode.java;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.math.BigInteger;

/**
 * 颠倒二进制位
 */
public class num_190 {
    /**
     * 这个可以做，但是没有考虑到二进制位的前几位为0的情况
     * @param n
     * @return
     */
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        int length = 32-s.length();
        String flage = "";
        char[] chars = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            flage += chars[i];
        }
        for(int j=0;j<length;j++){
            flage+= 0;
        }
        int result = Integer.parseInt(flage,2);

        return result;
    }

    /**
     * 低位出一个，然后走高位
     * @param n
     * @return
     */
    public static int reverseBits_1(int n) {
        int ret = 0;
        int power = 31;
        while (n>0){
            ret += (n&1)<<power;
            n = n>>1;
            power -= 1;
        }
        return ret;
    }

    public static Integer reverseBits_2(Integer n) {
        n = (n >>= 16) | (n <<= 16);
        n = ((n & 0xff00ff00) >> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1);
        return n;
    }

    public static void main(String[] args) {
        int i = 0xff00ff00;
        System.out.println(reverseBits_1(999));
    }
}
