package com.changhe.leetcode.java;

public class num_35 {

    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length;
        int mid = (start + end)/2;

        if(target <= nums[0]){
            return 0;
        }
        if(target >= nums[-1]){
            return nums.length;
        }

        while (end >= start ){
            if(target == nums[mid]){
                return mid;
            }
        }

        return  0;

    }
    public static void main(String[] args) {


    }
}
