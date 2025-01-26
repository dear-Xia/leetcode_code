package com.changhe.leetcode.java;

public class num_404 {
    //左叶子之和
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                return root.left.val;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
