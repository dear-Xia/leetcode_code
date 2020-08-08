package com.changhe.leetcode.java;

public class nun_69 {
    /**
     * 实现 int sqrt(int x) 函数
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int flage = 0;
        for(int i =1;i<=x;i++){
            if(i*i >= x){
               flage =  i;
               break;
            }
        }
        return (flage*flage == x)?flage:(flage-1);
    }

    /**
     * 牛顿迭代法
     * 快速求解函数零点的方法
     *
     * @param x
     * @return
     */
    public static  int mySqrt_1(int x){
        if(x == 0){
            return 0;
        }

        double c=x,x0=x;
        while (true){
            double xi = 0.5* (x0+c/x0);
            if(Math.abs(x0-xi)<1e-7){
                break;
            }
            x0 = xi;
        }
        return (int)x0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(5));
        System.out.println(mySqrt_1(5));
    }
}
