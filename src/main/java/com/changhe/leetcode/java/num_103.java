package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class num_103 {
    //二叉树的锯齿型遍历

    /**
     *采用双栈设计完成对根节点的存储
     * 设计标志位
     * @param root
     * @return
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null || root.val == 0 ){
            return lists;
        }
        stack.push(root);
        int control = 0;
        getObjectSignle(lists,stack,control);
        return lists;
    }
    public static  void getObjectSignle(List<List<Integer>> lists, Stack<TreeNode> stack,int control){
        if(stack == null || stack.empty()) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> next = new Stack<>();
        while (!stack.empty()){
            TreeNode flage = stack.pop();
            if(control%2 == 0){
                if(flage.left != null){
                    next.push(flage.left);}
                if(flage.right != null ){
                    next.push(flage.right);}
            }else {
                if(flage.right != null){
                    next.push(flage.right);}
                if(flage.left != null ){
                    next.push(flage.left);}
            }
            list.add(flage.val);
        }
         lists.add(list);
        getObjectSignle(lists,next,control+1);
    }



    public static void main(String[] args) {
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);
        root2.right.left.left = new TreeNode(6);
        root2.right.left.right = new TreeNode(7);
        root2.right.right = new TreeNode(4);
        //TreeNode treeNode = new TreeNode();
        //zigzagLevelOrder(root2);
        //zigzagLevelOrder(treeNode);
    }
}
