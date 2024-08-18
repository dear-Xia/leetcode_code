package com.changhe.leetcode.java;

public class num_53 {
    /**
     * 最大连续和子数组,当前写的这个思路不太行，边界没有考虑清楚
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int max = 0;
        int sumtmp = 0;
        for(int i=0;i<nums.length;i++){
           if(sumtmp <=0 && nums[i]<=0){
               continue;
           }
           for(int j=i;j<nums.length;j++){
               if(sumtmp<0){
                   break;
               }else {
                   sumtmp += nums[j];
                   max = Math.max(max,sumtmp);
               }
           }
            sumtmp = 0;

        }
        return max;
    }

    /**
     * 状态转移方程
     * f(i)=max{f(i−1)+nums[i],nums[i]}
     * @param nums
     * @return
     */
    public static int maxSubArray1(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];

        for (int x : nums){
            pre = Math.max(pre+x,x);
            maxAns = Math.max(pre,maxAns);
        }
        return maxAns;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
