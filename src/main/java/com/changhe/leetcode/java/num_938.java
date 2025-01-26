package com.changhe.leetcode.java;

public class num_938 {
    /**
     * 二叉搜索树的范围和
     * @param root
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        //计算和
        if(root == null){
            return 0;
        }else {
            if(root.val >= low && root.val <= high){
                return rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high)+root.val;
            }else if(root.val < low){
                return rangeSumBST(root.right,low,high);
            }else {
                return  rangeSumBST(root.left,low,high);
            }
        }

    }
    public static void main(String[] args) {

    }
}
