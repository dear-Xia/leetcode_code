package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_530 {
    /**
     *  1. 中序遍历得到有序的值
     *  2. 计算相邻值之间的差值，并返回最小值
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        //二叉搜索树的最小绝对差
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return 0;
        }
        bfs(root,list);
        int minDep = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            if(minDep > list.get(i)-list.get(i-1)){
                minDep = list.get(i)-list.get(i-1);
            }
        }
        return minDep;
    }
    public  void bfs(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            bfs(root.left,list);
        }
        list.add(root.val);
        if(root.right != null){
            bfs(root.right, list);
        }
    }
    public static void main(String[] args) {

    }
}
