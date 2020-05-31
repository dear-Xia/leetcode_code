package com.changhe.bull.online.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class stringSplit {
    public static void inpath(ArrayList<java.lang.String> strings){
        Scanner sc = new Scanner(System.in);

       /* while (sc.hasNextLine()){
            strings.add(sc.nextLine());
        }*/
        do {
            String line = sc.nextLine();
            if("".equals(line)){
                break;
            }
            strings.add(line);

        }while (true);

    }

    public static  ArrayList<String> getSplt(ArrayList<String> strings){
        ArrayList<String> temp = new ArrayList<String>();
        for(String s:strings){
            if(s.length()<8){
                int flage = 8-s.length();
                for(int i=0;i<flage;i++){
                    s+="0";
                }
                temp.add(s);
            }else if(s.length()==8){
                temp.add(s);
            }else {
                int a = s.length();
                int flage = a/8;
                int last = a%8;
                for(int i=0;i<flage;i++){
                    temp.add(s.substring(i*8,i+1*8));
                }
                if(last != 0){
                    int flages = 8-last;
                    String temp_str = s.substring(flage*8,flage+1*8);
                    for(int i=0;i<flages;i++){
                        temp_str += "0";
                    }
                    temp.add(temp_str);
                }
            }

        }
        return temp;
    }


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        inpath(strings);
        ArrayList<String> splt = getSplt(strings);
        for(String s : splt){
            System.out.println(s);
        }

    }
}
