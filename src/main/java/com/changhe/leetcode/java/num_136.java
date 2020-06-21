package com.changhe.leetcode.java;

import java.util.HashMap;

/**
 * 只出现一次的数
 */
public class num_136 {
    /**
     * 异或操作真的秀
     * 0和任何数异或的本身
     * 本身和本身异或得到0
     * 且异或满足交换律，可以解决乱序重复数据的问题
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int single = 0;
        for(int x : nums){
            single ^= x;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,3,4};
        System.out.println(singleNumber(nums));
    }
}
