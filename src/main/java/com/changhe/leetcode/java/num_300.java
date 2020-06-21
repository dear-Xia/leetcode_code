package com.changhe.leetcode.java;

public class num_300 {
    /**
     * 动态规划
     * @param nums
     * @return
     */

    public static int lengthOfLIS_1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

    /**
     * 看懂了
     * @param nums
     * @return
     */
    public  static int test(int[] nums){
        int[] dp = new int[nums.length];
        int maxLength = 1;
        dp[0] = maxLength;
        for(int i=1;i<nums.length;i++){
            int maxTemp = 0;
            for(int j=0;j<i;j++){
                if(nums[i]> nums[j]){
                    maxTemp = Math.max(maxTemp,dp[j]);
                }

            }
            dp[i] = maxTemp+1;
            maxLength = Math.max(maxLength,dp[i]);
        }
        return  maxLength;

    }

    /**
     * 二分+动态规划
     * @param nums
     * @return
     */
    public static int lengthOfLIS_2(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for(int num : nums) {
            int i = 0, j = res;
            while(i < j) {
                int m = (i + j) / 2;
                if(tails[m] < num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = num;
            if(res == j) {
                res++;
            }
        }
        return res;
    }




    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        //int x = lengthOfLIS_1(nums);
        int x = test(nums);

        System.out.println(x);

    }
}
