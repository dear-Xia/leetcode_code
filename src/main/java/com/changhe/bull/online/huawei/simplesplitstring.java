package com.changhe.bull.online.huawei;

import java.util.Scanner;

public class simplesplitstring {

    public  static void splits(String s){
        int flage = s.length() % 8;
        if(flage != 0){
            s = s+"00000000";
        }
        while (s.length()>=8){
            System.out.println(s.substring(0,8));
            s = s.substring(8);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        splits(line1);
        splits(line2);

    }
}
