package com.changhe.bull.online.huawei;

public class helanguopi {
    /**
     * 定义0，1，2
     * @param arr
     */
    public static  void getSort(int[] arr){
        int start = 0;
        int current = 0;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[current] == 1){
                current++;
            }else  if(arr[current] == 0){
                int flage = arr[start];
                arr[start] = arr[current];
                arr[current] = flage;
                current++;
                start++;
            }else {
                int flage = arr[current];
                arr[current] = arr[end];
                arr[end] = flage;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,2,1,2,0,2};
        getSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
