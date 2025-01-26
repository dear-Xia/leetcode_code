package com.changhe.leetcode.java;

public class num_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        /**
         * 路径总和
         * 给定一个值，判断是否存在根节点到叶子节点的和等于该值
         *
         */
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null ){
            if(root.val == targetSum) {
                return true;
            }else {
                return false;
            }
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
    public static void main(String[] args) {

    }
}
