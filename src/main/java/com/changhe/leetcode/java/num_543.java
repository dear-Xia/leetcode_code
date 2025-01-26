package com.changhe.leetcode.java;


public class num_543 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) {
            return 0; // 访问到空节点了，返回0
        }
        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
        ans = Math.max(ans, L+R+1); // 计算d_node即L+R+1 并更新ans
        return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
    }

    public int diameterOfBinaryTree1(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = diameterOfBinaryTree1(root.left);
        int r = diameterOfBinaryTree1(root.right);
        return l+r+1;
    }

    public int caculate(TreeNode root,Integer ints){
        //计算根节点的深度
        if(root == null){
            return 0;
        }
       return 0;
    }


    public static void main(String[] args) {

    }
}
