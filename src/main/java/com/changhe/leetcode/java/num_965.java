package com.changhe.leetcode.java;

import java.util.LinkedList;
import java.util.Queue;

public class num_965 {
    public static boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return false;
        }
        int val = root.val;
        boolean flage = true;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (q.size() > 0){
            TreeNode poll = q.poll();
            if(poll.val != val){
                flage = false;
                break;
            }
            if(poll.left != null){
                q.offer(poll.left);
            }
            if(poll.right != null){
                q.offer(poll.right);
            }
        }
        return flage;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        isUnivalTree(n1);
    }
}
