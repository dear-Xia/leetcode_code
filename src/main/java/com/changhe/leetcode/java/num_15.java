package com.changhe.leetcode.java;

import java.util.*;

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
        Arrays.sort(nums);
        Set<String> sets = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    List<Integer> list = new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        int size = sets.size();
                        sets.add(""+nums[i]+nums[j]+nums[k]);
                        if (size < sets.size()) {
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
     *双指针
     * @param nums
     * @return
     */
    public static  List<List<Integer>> threeSum2(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length<3){
            return null;
        }
        Arrays.sort(nums);
        Set<String> sets = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            List<Integer> list = new ArrayList<>();
            int k = nums.length-1;
            int j = i+1;
            while (j<=k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    int size = sets.size();
                    sets.add(""+nums[i]+nums[j]+nums[k]);
                    if (size < sets.size()) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                    }
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
        return lists;
    }


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for(int i=0;i<lists.size();i++){
            System.out.println(lists.get(i));
        }

    }
}
