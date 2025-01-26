package com.changhe.leetcode.java;

import java.util.LinkedList;
import java.util.Queue;

public class num_993 {
    /**
     * 给定root和x，y，判断x和y是否是堂兄弟节点
     * @param root
     * @param x
     * @param y
     * @return
     */
    public static boolean isCousins(TreeNode root, int x, int y) {
        boolean flage = false;
        //层序遍历，同时记录父节点
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return false;
        }
        FatherTreeNode fatherRootX = null;
        FatherTreeNode fatherRootY = null;
        q.offer(root);


        while (q != null){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode poll = q.poll();
                if(poll.left != null){
                    q.offer(poll.left);
                    if(poll.left.val == x){
                        fatherRootX = new FatherTreeNode(poll.val,poll.left.val,poll.left.left,poll.left.right);
                    }
                    if(poll.left.val == y){
                        fatherRootY = new FatherTreeNode(poll.val,poll.left.val,poll.left.left,poll.left.right);
                    }
                }
                if(poll.right != null){
                    q.offer(poll.right);
                    if(poll.right.val == x){
                        fatherRootX = new FatherTreeNode(poll.val,poll.right.val,poll.right.left,poll.right.right);
                    }
                    if(poll.right.val == y){
                        fatherRootY = new FatherTreeNode(poll.val,poll.right.val,poll.right.left,poll.right.right);
                    }
                }
            }
            if(fatherRootX != null || fatherRootY != null){
                break;
            }
        }
        if(fatherRootX != null && fatherRootY != null &&(fatherRootY.father != fatherRootX.father) ){
            flage = true;
        }
        return flage;

    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;

        isCousins(n1,5,4);
    }
}

class FatherTreeNode{
    public int father;
    public int val;
    public TreeNode left;
    public TreeNode right;

    public FatherTreeNode(int father,int val, TreeNode left, TreeNode right){
        this.father = father;
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
