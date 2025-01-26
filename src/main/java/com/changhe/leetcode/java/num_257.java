package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_257 {
    //二叉树所有路径
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        String s = String.valueOf(root.val);
        if(root.left == null && root.right == null){
            lists.add(s);
            return lists;
        }
        if(root.left != null) {
            getResult(s, lists, root.left);
        }
        if(root.right != null) {
            getResult(s, lists, root.right);
        }
        return lists;
    }
    public static void getResult(String s, List list, TreeNode root){
        if(root.left == null && root.right == null){
            s = s + "->"+ root.val;
            list.add(s);
            return;
        }
        s = s + "->"+ root.val;
        if(root.left != null) {
            getResult(s, list, root.left);
        }
        if(root.right != null) {
            getResult(s, list, root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        binaryTreePaths(n1);
    }
}
