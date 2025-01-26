package com.changhe.leetcode.java;

public class num_226 {//反转二叉树
    public TreeNode invertTree(TreeNode root) {
        TreeNode p = root;
        reviewTree(p);
        return root;
    }
    public void reviewTree(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        reviewTree(root.left);
        reviewTree(root.right);

    }
    public static void main(String[] args) {

    }
}
