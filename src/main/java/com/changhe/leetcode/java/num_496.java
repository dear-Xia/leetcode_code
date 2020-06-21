package com.changhe.leetcode.java;

import java.util.HashMap;
import java.util.Stack;

public class num_496 {
    /**
     * 使用hashmap来求所有的数据的下一个最大
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<Integer, Integer>();
        Stack<Integer> integers = new Stack<Integer>();
        for(int x : nums2){
            while (!integers.empty() && x>integers.peek()){
                integerIntegerHashMap.put(integers.pop(),x);
            }
            integers.push(x);
        }

            while (!integers.empty()){
                integerIntegerHashMap.put(integers.pop(),-1);
            }
        int [] result = new int[nums1.length] ;
        for(int i=0;i<nums1.length;i++){
            result[i] = integerIntegerHashMap.get(nums1[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] one = {4,1,2};
        int[] two = {1,3,4,2};
        int[] ints = nextGreaterElement(one, two);
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
