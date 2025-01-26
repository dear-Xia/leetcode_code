package com.changhe.leetcode.java;

import sun.reflect.generics.tree.Tree;

public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int val, TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
