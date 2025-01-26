package com.changhe.leetcode.java;

public class num_222 {
    //完全二叉树的节点个数
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;

    }

    public static void main(String[] args) {

    }
}
