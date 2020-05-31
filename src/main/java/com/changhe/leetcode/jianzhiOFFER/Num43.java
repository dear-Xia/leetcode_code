package com.changhe.leetcode.jianzhiOFFER;

public class Num43 {
    public static void main(String[] args) {

        //int sum = countDigitOne(501);
        int sum = countDigitOne1(501);

        System.out.println(sum);

    }
    public static  int countDigitOne(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=getNum(i);
        }
        return sum;
    }

    public static int getNum(int n){
        if(n<10){
            if(n == 1){
                return 1;
            }else {
                return 0;
            }
        }else{
            return getNum(n%10)+getNum(n/10);
        }
    }

    public static int countDigitOne1(int n) {
        //求每个位的数字所用
        int index = 1;
        //记录1的个数
        int count = 0;
        int high = n,cur = 0,low = 0;
        //由于high = n /(index*10) 中index *10 很容易越位
        //特修改如下
        while(high > 0){
            high /= 10;
            cur = (n / index) % 10;
            low = n - (n / index) * index;
            //以下是计算的公式
            if(cur == 0) count += high * index;
            if(cur == 1) count += high * index + low + 1;
            if(cur > 1) count += (high+1) * index;
            index *= 10;
        }
        return count;
    }
}
