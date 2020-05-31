package com.changhe.leetcode.java;

import java.util.HashMap;

public class num_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if(result[1] != 0)
                break;
        }
        return  result;

    }

    /**
     * hash结构查询时间最快O（1），最慢O（n）
     * 可以选用hashmap结构完成一定的查询优化
     * @param nums
     * @param target
     * @return
     * @throws Exception
     */
    public static int[] twoSum_1(int[] nums,int target) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        throw  new Exception();
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {3,2,3};
        int target = 6;
        //int[] ints = twoSum(nums, target);
        int[] ints = twoSum_1(nums, target);
        System.out.println(ints[0]+"--"+ints[1]);
    }
}
