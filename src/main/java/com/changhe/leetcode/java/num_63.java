package com.changhe.leetcode.java;

public class num_63 {
    /**
     * 带有障碍的跳跃
     * 二维数组中为1的表示是障碍，这里设置为到达次数为0
     * @return
     */
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] nums = new int[obstacleGrid.length][obstacleGrid[0].length];
        boolean mflage = false;
        boolean nflage = false;
        for(int i=0;i<obstacleGrid.length;i++){
            if(mflage){
                nums[i][0] = 0;
                continue;
            }
            if(obstacleGrid[i][0] == 1){
                nums[i][0] = 0;
                mflage = true;
            }else {
                nums[i][0] = 1;
            }
        }
        for(int j=0;j<obstacleGrid[0].length;j++){
            if(nflage){
                nums[0][j] = 0;
                continue;
            }
            if(obstacleGrid[0][j] == 1){
                nums[0][j] = 0;
                nflage = true;
            }else {
                nums[0][j] = 1;
            }
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j = 1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] == 1){
                    nums[i][j] = 0;
                }else {
                    nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
                }
            }
        }
        return nums[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] test = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(test));
    }
}
