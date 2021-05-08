package com.changhe.leetcode.java;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class num_94 {
    /**
     * 二叉树中序遍历
     * @param
     */
    public  static  void getMidTree(TreeNode root){
       List list = new ArrayList<TreeNode>();
       testGetMidTree(list,root);
        System.out.println(list);
    }
    public static void testGetMidTree(List<TreeNode> result,TreeNode root){
        if(root == null){
            return;
        }
        testGetMidTree(result,root.left);
        result.add(root);
        testGetMidTree(result,root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(3);

        getMidTree(root);
    }
}
