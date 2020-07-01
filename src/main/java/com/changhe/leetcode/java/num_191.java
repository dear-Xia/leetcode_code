package com.changhe.leetcode.java;

/**
 * 计算给定无符号二进制数的1有多少个
 */
public class num_191 {

    public  static int getOnwNum(int n){
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int num  = 0;
        for (char c : chars){
            if( c == '1')
                num++;
        }
        return num;
    }

    /**
     * 循环位移
     * @param
     */
    public  static int getOnwNum_1(int n){
        int num = 0;
        int mark = 1;
        for(int i=0;i<32;i++){
            if((n&mark)!=0){
                num++;
            }
            n>>=1;
        }
        return  num;
    }

    /**
     * 更新操作，使用整个数n和n-1与，这样可以保证最后一位为0，当结果最终为0 的时候表示结束
     * @param n
     * @return
     */
    public  static int getOnwNum_2(int n){
        int num = 0;
        while (n != 0 ){
            num++;
            n &= (n-1);
        }
        return num;
    }



    public static void main(String[] args) {
        System.out.println(getOnwNum(11));
        System.out.println(getOnwNum_1(11));
        System.out.println(getOnwNum_2(11));
    }
}
