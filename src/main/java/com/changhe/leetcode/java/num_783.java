package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_783 {
    /**
     * 二叉搜索树节点距离最小
     * @param root
     * @return
     */
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getList(root,list);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            if(list.get(i)-list.get(i-1)<min){
                min = list.get(i)-list.get(i-1);
            }
        }
        return min;
    }
    public void getList(TreeNode root,List<Integer>list){
        if(root == null){
            return;
        }
        getList(root.left,list);
        list.add(root.val);
        getList(root.right,list);
    }
    public static void main(String[] args) {

    }
}
