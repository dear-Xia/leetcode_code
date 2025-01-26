package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class num_501 {
    /**
     * 1.需要遍历BST
     * 2.记录节点val，并计算次数
     * 3，遍历记录的内容，返回众数
     * @param root
     * @return
     */
    public static int[] findMode(TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        //返回二叉搜索树中的众数
        Map<Integer,Integer> maps = new HashMap<>();
        if(root == null){
            return null;
        }
        caculate(root,maps);
        Object[] array = maps.values().toArray();
        int maxTimes = 0;
        for (int i =0; i< array.length;i++){
            if(maxTimes <= (Integer) array[i]){
                maxTimes = (Integer) array[i];
            }
        }
        for (Map.Entry<Integer,Integer> entry: maps.entrySet()){
            if(entry.getValue() == maxTimes){
                lists.add(entry.getKey());
            }
        }
        int[] ints = new int[lists.size()];
        for(int i=0;i<lists.size();i++){
            ints[i] = lists.get(i);
        }
        return ints;
    }
    public static void caculate(TreeNode root, Map<Integer,Integer> map){
        if(root == null){
            return;
        }
        if(map.containsKey(root.val)){
            map.replace(root.val, map.get(root.val) + 1);
        }else {
            map.put(root.val, 1);
        }
        if(root.left != null) {
            caculate(root.left, map);
        }
        if(root.right != null) {
            caculate(root.right, map);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        n1.right = n2;
        n2.left = n3;
        findMode(n1);
    }
}
