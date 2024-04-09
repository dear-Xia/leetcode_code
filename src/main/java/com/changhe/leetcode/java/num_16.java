package com.changhe.leetcode.java;

import java.util.*;

public class num_16 {

    /**
     *双指针
     * @param nums
     * @return
     */
    public static  Integer threeSum2(int[] nums,int target){
        if(nums == null || nums.length<3){
            return null;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            List<Integer> list = new ArrayList<>();
            int k = nums.length-1;
            int j = i+1;
            while (j<=k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    j++;
                    k--;
                }
                if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

    }
}
