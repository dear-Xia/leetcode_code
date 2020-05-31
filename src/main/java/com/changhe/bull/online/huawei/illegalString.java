package com.changhe.bull.online.huawei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class illegalString {
    public static  ArrayList<String> input(ArrayList<String > arrayList){
        Scanner sc = new Scanner(System.in);
        do{
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }
            arrayList.add(line);
        }while (true);

        return arrayList;
    }
    public  static  void getIllegalString(ArrayList<String>arrayList, HashSet<String> hashSet, List<String>list){
        for(int i=0;i<arrayList.size();i++){
            String  s = arrayList.get(i);
            char[] chars = s.toCharArray();
            boolean flage = true;
            for(int j=0;j<chars.length;j++){
                if(chars[j]>122 || chars[j]<48 || (chars[j]>57 && chars[j]<65) || (chars[j]>90 && chars[j]<97)){
                    flage = false;
                    break;
                }
            }
            if(flage){
                hashSet.add(s);
            }else {
                list.add(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> input = input(a);
        HashSet<String> hashSet = new HashSet<String>();
        List<String> list =  new ArrayList<String>();

        getIllegalString(input,hashSet,list);
        for(String s: hashSet){
            System.out.print(s);
            System.out.print(" ");
        }

        System.out.println();

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }

    }
}
