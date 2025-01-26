package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class num_872 {

    //叶子相似的树
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean flage = true;
        TreeNode p = root1;
        TreeNode q = root2;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getList(p,list1);
        getList(q,list2);

        if(list1.size() != list2.size() || list1 == null || list2 == null){
            return false;
        }else {
            for(int i=0;i<list1.size();i++){
                if(!list1.get(i).equals(list2.get(i))){
                    flage = false;
                    break;
                }
            }
        }
        return flage;
    }
    public static void getList(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        getList(root.left,list);
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        getList(root.right, list);

    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(200);
        n1.left = n2;
        n1.right = n3;
        leafSimilar(n1,n1);
    }
}
