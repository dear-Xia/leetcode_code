package com.changhe.leetcode.java;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class num_111 {
    //DSF
    public int minDepth(TreeNode root) {
        /**
         * 二叉树的最小深度
         */
        if(root == null){
            return 0;
        }
        int minDepth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            int size = q.size();
            while (size>0){
                TreeNode node = q.poll();
                if(node.left == null && node.right == null){
                    return minDepth;
                }
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
                size --;
            }
            minDepth++;

        }
        return minDepth;
    }
    //BFS
    //记录最小深度
    private int minDepth = Integer.MAX_VALUE;
    //记录当前遍历节点的深度
    private int currentDepth=0;

    public int minDepthBFS(TreeNode root){
        if(root == null){
            return 0;
        }
        //从根节点开始遍历

        return minDepth;
    }
    private void traverse(TreeNode root){
        if(root == null){
            return;
        }
        //前序位置进入节点时增加当前深度
        currentDepth++;
        //如果当前节点是叶子节点，更新最小深度
        if(root.left == null && root.right == null){
            minDepth = Math.min(currentDepth,minDepth);
        }
        traverse(root.left);
        traverse(root.right);

        //后序位置离开节点时减少当前深度
        currentDepth--;
    }
    public static void main(String[] args) {

    }
}
