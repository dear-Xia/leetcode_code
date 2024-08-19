package com.changhe.leetcode.java;

public class num_55 {
    /**
     * 跳跃游戏，动规
     * @param nums
     * @return
     *
     */
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
