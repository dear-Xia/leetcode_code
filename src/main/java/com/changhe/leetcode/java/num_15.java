package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class num_15 {
    /**
     * 蛮力
     * @param nums
     * @return
     */
    public static  List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length<3){
            return null;
        }
        Set<Integer> numset = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    List<Integer> list = new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k] == 0){
                        int length = numset.size();
                        numset.add(nums[i]);
                        numset.add(nums[j]);
                        numset.add(nums[k]);
                        if(numset.size()-length>0) {
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            lists.add(list);
                        }
                    }
                }
            }
        }

        return lists;

    }

    /**
     *
     * @param nums
     * @return
     */
    public static  List<List<Integer>> threeSum2(int[] nums){
        return null;
    }


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for(int i=0;i<lists.size();i++){
            System.out.println(lists.get(i));
        }

    }
}
