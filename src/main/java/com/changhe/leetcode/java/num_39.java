package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        int num = 0;
        int nums = 0;
        for(int i=0;i<candidates.length;i++){
            num += candidates[i];
            if(num > target){
                break; 
            }
            nums++;
        }
        if(nums == 0){
            return lists;
        }else {
            for(int i=1;i<=nums;i++){
                
            }
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
