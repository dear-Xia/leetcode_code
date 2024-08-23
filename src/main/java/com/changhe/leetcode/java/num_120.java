package com.changhe.leetcode.java;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class num_120 {

    /**
     * 三角形自定向下的最短距离
     * 边界
     *  只有一行的时候，结果就是这个值
     *
     *  状态转移方程
     *  f(i) = min(f(i-1))
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> lists = new ArrayList<>();
        if(triangle.size() == 1){
            return triangle.get(0).get(0);
        }else {
            List<Integer> list1 = new ArrayList<>();
            list1.add(triangle.get(0).get(0));
            lists.add(list1);
        }
        for(int i=1;i<triangle.size();i++){
            List<Integer> integers = triangle.get(i);
            List<Integer> listi = new ArrayList<>();
            List<Integer> listi1 = lists.get(i-1);
            for(int j=0;j<integers.size();j++){
                if(j == 0){
                    listi.add(integers.get(j)+listi1.get(j));
                }else if(j == integers.size()-1) {
                    listi.add(integers.get(j)+listi1.get(j-1));
                }else {
                    listi.add(Math.min(integers.get(j)+listi1.get(j),integers.get(j)+listi1.get(j-1)));
                }
            }
            lists.add(listi);
        }
        List<Integer> integers = lists.get(lists.size() - 1);
        int min  = integers.get(0);
        for(Integer s: integers){
            min = Math.min(min,s);
        }
        return min;
    }

    /**
     * 动态规划和空间优化
     * @param triangle
     * @return
     */
    public static int minimumTotal1(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] f = new int[n];
        f[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            f[i] = f[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; --j) {
                f[j] = Math.min(f[j - 1], f[j]) + triangle.get(i).get(j);
            }
            f[0] += triangle.get(i).get(0);
        }
        int minTotal = f[0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[i]);
        }
        return minTotal;
    }

    public static void main(String[] args) {
        /***
         * [[2],[3,4],[6,5,7],[4,1,8,3]]
         */
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list.add(list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        list.add(list4);
        minimumTotal(list);
    }
}
