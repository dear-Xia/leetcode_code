package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_118 {
    /**
     * 杨辉三角
     * 第一行为1
     * 第二行为两个1
     * 最优子结构
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if(numRows>0){
            List list1 = new ArrayList();
            list1.add(1);
            lists.add(list1);
        }
        if(numRows>1){
            List list2 = new ArrayList();
            list2.add(1);
            list2.add(1);
            lists.add(list2);
        }
        if(numRows >2){
            for(int i=3;i<=numRows;i++){
                List<Integer> listtmp = lists.get(i - 2);
                List listi = new ArrayList();
                for(int j=0;j<i;j++){
                    if(j == 0){
                        listi.add(1);
                    }else if(j == i-1){
                        listi.add(1);
                    }else{
                        listi.add(listtmp.get(j-1)+listtmp.get(j));
                    }
                }
                lists.add(listi);
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
