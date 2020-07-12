package com.changhe.leetcode.java;

public class num_268 {

    /**
     * 好思路
     * @param nums
     * @return
     */
    public static int missingMunber(int[] nums){
        int sum = 0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            sum -= nums[i];
        }
        return sum;
    }

    /**
     * 异或操作
     * 关注一下这个操作
     * @param nums
     * @return
     */
    public static int missingNumbre(int[] nums){
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;

    }

    public static void main(String[] args) {
        int[] nums = {0,3,6,2,5,4};
        System.out.println(missingNumbre(nums));
    }
}
