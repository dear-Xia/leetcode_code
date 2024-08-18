package com.changhe.leetcode.java;

public class num_45 {
    //跳跃游戏

    /**
     * 从第一个开始，下一次可以到达的是nums[i]值范围的所有点
     *
     * @param nums
     * @return
     */
    public static int jump(int[] nums) {
        int times = 0;
        int length  = nums.length;
        int start = 0;
        while (start<length){
            int num = nums[start];
            int index = 0;
            int sum = 0;
            for(int i=1;i<=num;i++){
               if(sum<=nums[start+i]+start+i){
                   sum = nums[start+i]+start+i;
                   index = start+i;
               }
            }
            if(sum>=length-1){
                times++;
                break;
            }else {
                start = index;
            }
        }
        return times;
    }
    public static int jump1(int[] nums){
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(jump(nums));
    }
}
