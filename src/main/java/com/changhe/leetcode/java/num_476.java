package com.changhe.leetcode.java;

public class num_476 {
    /**
     * 对给定的整数的补码值
     * 找到相同位数的全1的二进制，异或就得到结果
     * @param num
     * @return
     */
    public static int findComplement(int num) {
       double flage = 0;
       for(int i=0;num>=flage;i++){
           flage = Math.pow(2,i);
       }
       return num^((int)flage-1);


    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
