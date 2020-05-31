package com.changhe.bull.online.huawei;

import java.util.Scanner;

public class stage {
    public static  int input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    public static int getNums(int n){
        if(n == 1){
            return 1;
        }else  if(n == 2){
            return  2;
        }else {
            return getNums(n-1)+ getNums(n-2);
        }
    }

    public static void main(String[] args) {
        int n = input();
        int nums = getNums(n);
        System.out.println(nums);

    }
}
