package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_144 {

    //二叉树前序遍历
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getResult(root,list);
        return list;
    }
    public  static  void getResult(TreeNode root,List<Integer>list){
        if(root == null){
            return;
        }
        list.add(root.val);
        getResult(root.left,list);
        getResult(root.right,list);
    }
    public static void main(String[] args) {
        //TreeNode root1  = new TreeNode();
        TreeNode root2 = new TreeNode(1);
        root2.left = null;
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);
        root2.right.right = null;
        TreeNode root3  = new TreeNode(1);
        root3.left = null;
        root3.right = null;

        //preorderTraversal(root1);
        preorderTraversal(root2);
        preorderTraversal(root3);
        System.out.println();

    }
}
