package com.changhe.leetcode.java;

public class num_62 {
    public static int uniquePaths(int m, int n) {
        if(m == 1 && n == 1){
            return 1;
        }else {
            if(m-1>0 && n-1>0){
                return uniquePaths(m-1,n)+uniquePaths(m,n-1);
            }else if(n-1 == 0){
                return uniquePaths(m-1,1);
            }else{
                return uniquePaths(1,n-1);
            }
        }
    }
    public static int uniquePaths1(int m, int n) {
       int[][] nums = new int[m][n];
       for(int i=0;i<m;i++){
           nums[i][0] = 1;
       }
       for(int j=0;j<n;j++){
           nums[0][j] = 1;
       }
       for(int i=1;i<n;i++){
           for(int j = 1;j<m;j++){
               nums[i][j] = nums[i-1][j]+nums[i][j-1];
           }
       }
       return nums[m-1][n-1];
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
        System.out.println(uniquePaths(3,2));
    }
}
