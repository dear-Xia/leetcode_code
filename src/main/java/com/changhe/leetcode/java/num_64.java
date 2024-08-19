package com.changhe.leetcode.java;

public class num_64 {
    public static int minPathSum(int[][] grid) {
        int[][] nums = new int[grid.length][grid[0].length];
        nums[0][0] = grid[0][0];
        for(int i=1;i<grid[0].length;i++){
            nums[0][i] = grid[0][i] + nums[0][i-1];
        }
        for(int j=1;j<grid.length;j++){
            nums[j][0] = grid[j][0]+ nums[j-1][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                nums[i][j] = Math.min(nums[i-1][j],nums[i][j-1])+grid[i][j];
            }
        }
        return nums[grid.length-1][grid[0].length-1];
    }
    public static void main(String[] args) {
        int[][]nums = {{1,3,1},{1,5,1},{4,2,1}};
        minPathSum(nums);
    }
}
