package com.changhe.leetcode.java;

public class num_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /**
         * 边缘地带的处理
         */
        if(p == null || q == null){
            if(p == null && q == null){
                return true;
            }else {
                return false;
            }
        }
        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return  false;
        }
    }

    public static void main(String[] args) {

    }
}
