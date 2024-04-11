package com.changhe.leetcode.java;

import java.util.*;

public class num_16 {

    /**
     *双指针
     * @param nums
     * @return
     */
    public static  int threeSum2(int[] nums,int target){
        if(nums == null || nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int k = nums.length-1;
            int j = i+1;
            while (j<k){
                int flage = nums[i] + nums[j] + nums[k];
                if(flage == target){
                    result = target;
                    break;
                }else {
                    if(Math.abs(result-target) >= Math.abs(flage - target)){
                        result = flage;
                    }
                    if(flage > target){
                        k--;
                    }else {
                        j++;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] nums = {-1,2,1,-4};
        threeSum2(nums,1);

    }
}
