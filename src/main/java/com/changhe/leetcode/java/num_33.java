package com.changhe.leetcode.java;

public class num_33 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int middle = (left+right)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]>target){
                if(nums[left]>nums[middle]){
                    //右边有序
                    if(nums[right]<target){
                        //结果在右边
                        left = middle+1;
                    }else {
                        //结果在左边
                        right = middle-1;
                    }
                }else {
                    //左边有序
                    if(nums[left]>target){
                        //结果在右边
                        left = middle+1;
                    }else {
                        //结果在左边
                        right = middle-1;
                    }
                }
            }
            if(nums[middle]<target){
                if(nums[middle]>nums[right]){
                    //左边有序 //结果肯定在右边
                    if(nums[left] > target){
                        //结果在左边
                        right = middle-1;
                    }else {
                        //结果在右边
                        left = middle +1;
                    }

                }else {
                    //右边有序//判断一下右边的边界
                    if(nums[right]>=target){
                        //结果在右边
                        left = middle +1;
                    }else {
                        //结果在左边
                        right = middle -1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,1};
        int[] nums1 ={5,1,3};
        int[] nums2 = {4,5,6,7,8,1,2,3};
        int[] nums3 = {5,1,2,3,4};
        search(nums3,1);
    }
}
