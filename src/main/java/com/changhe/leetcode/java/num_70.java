package com.changhe.leetcode.java;

import java.util.HashMap;
import java.util.Map;

public class num_70 {
    //递归方法
    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
    //带有备忘录的递归
    public  static Map<Integer,Integer> nums = new HashMap<>();
    public static int climbStairs1(int n) {
        if(n == 0){
            return 1;
        }
        if(n<=2){
            return n;
        }
        if(nums.containsKey(n)){
            return nums.get(n);
        }else {
            nums.put(n,climbStairs1(n-1)+climbStairs1(n-2));
            return nums.get(n);
        }
    }

    /**
     *
     *带有备忘录的递归，是从n往1方向延伸求解，即自顶向下解法
     *动态规划从较小的问题解，由交叠形式，逐步决策出较大问题的解，是从1到n方向，往上求解，即自底向上
     * 动态规划由几个特征：最优子结构，状态转移方程，边界，重叠子问题
     * 当前问题中，f(n-1)和f(n-2)为f(n)的最优子结构
     * f(n) = f(n-1)+f(n-2)为状态转移方程
     * f(1) = 1,f(2) = 2为边界
     * f(8)-f(1)都是重叠子问题
     */
    //动态规划
    public static int climbStairs2(int n) {
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int tmp = 0;
        for(int i=3;i<=n;i++){
            tmp = (a+b)%100000007;
            a = b;
            b = tmp;
        }
        return tmp;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(9));
        System.out.println(climbStairs1(9));
    }
}
