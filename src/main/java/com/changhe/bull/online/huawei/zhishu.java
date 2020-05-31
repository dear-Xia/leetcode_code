package com.changhe.bull.online.huawei;

import java.util.*;

public class zhishu {
    public static String getResult1(long ulDataInput){
        StringBuilder result = new StringBuilder("");
        for (long i=2;i<=ulDataInput;i++){
            if(ulDataInput % i ==0){
                result.append(i+" ");
                ulDataInput = ulDataInput/i;
                i=1;
            }
        }
        return result.toString();
    }
    public static String getResult(long ulDataInput ){
        String s = "";
        for(int i = 2;i<=ulDataInput;i++){
            if(ulDataInput%i == 0){
                s+=i+" ";
                ulDataInput = ulDataInput/i;
                i = 1;
            }
        }
        return s;
    }
    //质数
    public static boolean isPrime(long num) {
        int tmp=(int)Math.sqrt(num);
        boolean flag = true;
        for(int i=2;i<=tmp;i++) {
            if(0==num%i) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        System.out.println(getResult(num));

        //定义
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //方法
        map.put(1,2);
        map.size();
        map.get(1);
        map.containsKey(1);
        map.containsValue(2);
        //遍历
        //1，单个遍历,使用增强for，使用get方法，获取value
        Set<Integer> s = map.keySet();
        //获取value的集合
        Collection<Integer> values = map.values();
        //2，整体
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer,Integer> entry:  entries){
            entry.getKey();
            entry.getValue();
        }


    }
}

/**
 * map定义个和存放以及遍历输出
 */

