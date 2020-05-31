package com.changhe.leetcode.jianzhiOFFER;

import java.util.prefs.PreferenceChangeEvent;

public class N_array_60 {

    public static void main(String[] args) {
        twoSum(2);
    }

   /* 题目大意：
    简单来说，n个骰子同时掷出，题目要我们求每个点数的概率组成的数组（以下简称点数概率数组）

    解题思路：
    根据动态规划的思想分解子问题。
    我们可以把n个骰子的点数分解为n-1个骰子的点数加上一个骰子的点数。
    根据1个骰子的点数概率数组求出2的点数概率数组，根据2的点数概率数组求出3的点数概率数组....直到求出n的点数。
    那么我们要怎么根据n-1个骰子的点数概率数组求出n个骰子的点数概率数组呢？
    我们假设n=2。
    则我们已知1的点数概率数组为{1/6d,1/6d,1/6d,1/6d,1/6d,1/6d}
    我们要求的2个骰子，可以分解为n-1个骰子和1个骰子
    同时易知2个骰子的点数概率数组长度为2*5+1。
    则：
    如图，x,y分别为n-1数组和1数组指针。

    使得n-1点数概率数组和1点数概率数组元素两两相乘，并将乘积结果加到n点数概率数组上。
    运算完成后就得到了最终的n点数概率数组。

    基本思路如上，然后我们可以根据动态规划的套路：
            1.构造dp数组：tmp[]为n个骰子的点数概率数组，pre[]为n-1个骰子的点数概率数组，一个骰子的点数概率数组显然是6个六分之一,不需要另设数组。
            2.初始化dp数组：pre[]={1/6d,1/6d,1/6d,1/6d,1/6d,1/6d}
3.构造状态转移方程:tmp[x+y]+=pre[x]*num[y];
    Java代码如下：*/

    public static double[] twoSum(int n) {
        double pre[]={1/6d,1/6d,1/6d,1/6d,1/6d,1/6d};
        for(int i=2;i<=n;i++){
            double tmp[]=new double[5*i+1];
            for(int j=0;j<pre.length;j++)
                for(int x=0;x<6;x++)
                    tmp[j+x]+=pre[j]/6;
            pre=tmp;
        }
        return pre;
    }

    public  static double[]  MyTest(int n){

        double[] pre = {1/6d,1/6d,1/6d,1/6d,1/6d,1/6d};

        for(int i = 2;i<= n;i++){

            double[] temp = new double[i*5+1];

            for(int j=0 ; j< pre.length;j++){
                for(int x=0;x<6;x++){
                    temp[j+x] += pre[j]/6;
                }
            }

            pre = temp;
        }
        return  pre;
    }

}
