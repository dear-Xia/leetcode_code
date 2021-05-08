package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_145 {

    //二叉树后续遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getResult(root,list);
        return list;

    }

    public static void getResult(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        getResult(root.left,list);

        getResult(root.right,list);
        list.add(root.val);
    }
    public static void main(String[] args) {

    }
}
