package com.changhe.bull.online.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class huaweijishi {
    public static ArrayList<String>  splits(String s,ArrayList<String> list){
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            boolean flage1 = chars[i]>90 && chars[i]<97;
            if(flage1 || chars[i]<65 || chars[i]>122){
                chars[i] = '0';
            }
        }
        String s1 = "";
        for(int i=0;i<chars.length;i++){
            s1+=chars[i];
        }
        String[] split = s1.split("0");
        for(String ss:split){
            if(ss.length()>0) {
                char[] ssChar = ss.toCharArray();
                if(ssChar[0]>=65 && ssChar[0]<=90){
                    list.add(ss);
                }else {
                    ssChar[0] = (char)(ssChar[0] -32);
                    String flage = "";
                    for(int i=0;i<ssChar.length;i++){
                        flage+=ssChar[i];
                    }
                    list.add(flage);
                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        ArrayList<String> list = new ArrayList<String>();

        splits(line,list);
        if(list.size() == 0){
            System.out.println(".");
        }else {
            String result = "";
            for(String s: list) {
                    result+=s+" ";
             }
            char[] chars = result.toCharArray();
            chars[chars.length-1] = '.';
            String flage = "";
            for(int i=0;i<chars.length;i++){
                flage+=chars[i];
            }
            System.out.print(flage);
        }

    }
}
