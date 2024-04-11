package com.changhe.leetcode.java;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class num_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length<4){
            return lists;
        }
        Arrays.sort(nums);
        Set<String> stringSet = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k = j+1;
                int l = nums.length-1;
                while (k<l){
                    long flage = (long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(flage == target){
                        String f = ""+nums[i]+nums[j]+nums[k]+nums[l];
                        int size = stringSet.size();
                        stringSet.add(f);
                        if(stringSet.size() > size){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            lists.add(list);
                        }
                        k++;
                        l--;
                    }else if(flage <= target){
                        k++;
                    }else {
                        l--;
                    }
                }
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int[] numss = {1000000000,1000000000,1000000000,1000000000};
        fourSum(numss,-294967296);
        int a = 1000000000;
        System.out.println(a);
        //fourSum(nums,0);
    }
}
