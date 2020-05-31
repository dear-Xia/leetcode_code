package com.changhe.leetcode.java;

import jdk.management.resource.ResourceType;
import sun.applet.resources.MsgAppletViewer_ja;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class num_169 {
    /**
     * 结果有问题，回来复查
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> enty: entries){
            if(nums.length%2 == 1){
                if(enty.getValue() > nums.length/2  ){
                    result =  enty.getKey();
                    break;
                }
            }else{
                if(enty.getValue() >= nums.length/2 ){
                    result =  enty.getKey();
                    break;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
