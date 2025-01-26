package com.changhe.leetcode;

import com.changhe.leetcode.java.TreeNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class num_104 {
    /**
     * 二叉树的最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxDepth = 0;

        while (!q.isEmpty()){
            int size = q.size();
            while (size>0){
                TreeNode poll = q.poll();
                if(poll.left != null){
                   q.offer(poll.left);
                }
                if(poll.right != null){
                    q.offer(poll.right);
                }
                size --;
            }
           maxDepth ++;
        }
        return maxDepth;
    }

    public int maxDFS(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDFS(root.left);
        int right = maxDFS(root.right);
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {

    }
}
