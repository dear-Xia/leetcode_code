package com.changhe.leetcode.java;

public class num_11 {
    /**
     * 方法1，蛮力
     * @param nums
     * @return
     */
    public static int getMaxWater(int[] nums){
        int max = 0;
        if(nums == null || nums.length<2){
            return max;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                max = Math.max(max,Math.min(nums[i],nums[j])*(j-i));
            }
        }
        return max;
    }

    /**
     * 方法2，双指针
     * @param nums
     * @return
     */
    public static int getMaxWater2(int[] nums){
        int max = 0;
        if(nums == null || nums.length<2){
            return max;
        }
        int i=0,j=nums.length-1;
        while (i<j){
            max = Math.max(max,Math.min(nums[i],nums[j])*(j-i));
            if (nums[i]>nums[j]) {
                j--;
            }else {i++;}
        }

        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int maxWater = getMaxWater(nums);
        int maxWater2 = getMaxWater2(nums);
        System.out.println(maxWater2);
        //System.out.println(maxWater);
    }
}
