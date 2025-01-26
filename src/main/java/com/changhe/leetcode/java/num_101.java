package com.changhe.leetcode.java;

public class num_101 {
    /**
     * 对称二叉树
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }else {
           return isSameTree(root.left, root.right);
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /**
         * 边缘地带的处理
         */
        if (p == null || q == null) {
            if (p == null && q == null) {
                return true;
            } else {
                return false;
            }
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
