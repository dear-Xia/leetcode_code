package com.changhe.bull.online.huawei;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class topN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        //查询第几个
        int result = ss.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        do{
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }
            list.add(Integer.valueOf(line));
        }while (true);
        Integer[] integers = (Integer[]) list.toArray(new Integer[list.size()]);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(4);
//        list.add(5);
//        list.add(2);
//        list.add(1);
//        list.add(3);
//
//        Integer[] integers = (Integer[]) list.toArray(new Integer[list.size()]);


        quickSort(integers,0,integers.length-1);

//        for(int i=0;i<integers.length;i++){
//            System.out.println(integers[i]);
//        }
        if(result>integers.length || result<1){
            System.out.println("null");
        }else {
            System.out.println(integers[result-1]);
        }

    }


    private static void quickSort(Integer[] arr, int low, int high){
        if (low < high){
            int pivot=partition(arr, low, high);        //将数组分为两部分
            quickSort(arr, low, pivot-1);                   //递归排序左子数组
            quickSort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }
    private static int partition(Integer[] arr, int low, int high){
        int pivot = arr[low];     //枢轴记录
        int i = low;
        int j = high;
        while (i<j){
            while(arr[j] >= pivot && i<j){
                j--;
            }
            while (arr[i] <= pivot && i<j){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //扫描完成，枢轴到位
        arr[low] = arr[i];
        arr[i] = pivot;
        //返回的是枢轴的位置
        return low;
    }
}
