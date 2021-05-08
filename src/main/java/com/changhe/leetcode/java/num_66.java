package com.changhe.leetcode.java;

import sun.java2d.windows.GDIWindowSurfaceData;

public class num_66 {
    /**
     * 加一
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        boolean flage = true;
        int[] temp = digits;
        for(int i=temp.length-1 ; i>=0;i--){
            if(flage){
                temp[i] = temp[i]+1;
                if(temp[i]<10){
                    flage = false;
                }else {
                    temp[i] = 0;
                }
            }else {

            }
        }
        if(temp[0] == 0){
            temp = new int[temp.length + 1];
            temp[0] = 1;
        }

        return temp;
    }
    public static void main(String[] args) {

        int[] digits = {9};
        System.out.println(plusOne(digits));
    }
}
