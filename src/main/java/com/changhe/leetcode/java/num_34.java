package com.changhe.leetcode.java;

public class num_34 {
    public static int[] searchRange(int[] nums, int target) {

        if(nums.length == 0){
           return new int[]{-1,-1};
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            if(nums[middle] == target){
                while (nums[left] != target){
                    left++;
                }
                while (nums[right] != target){
                    right--;
                }
                return new int[]{left,right};
            }
            if(nums[middle]>target){
                right = middle-1;
            }
            if(nums[middle]<target){
                left = middle+1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

    }
}
