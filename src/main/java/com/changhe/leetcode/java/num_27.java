package com.changhe.leetcode.java;

public class num_27 {

    /**
     * 移除数组中的元素，保持顺序不变
     * 思路：
     * 首先是遍历
     * 给俩个指针，一个指向不重复的位置，一个指向前移的位数
     * @param nums
     * @param val
     * @return
     */
    public static  int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                length ++;
            }else{
                nums[i-length] = nums[i];
            }
        }
        return nums.length-length;

    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
