package com.changhe.bull.online.huawei;

import java.util.ArrayList;

/**
 * 计算最大的字串值
 * 思路：
 *  定义当前字串currSum为最大字串，maxSum为最后返回的最大子数组的和，则：
 *          对于第i+元素，有两种选择，当作新的字串的第一个元素和放入当前串
 *          判断条件是：
 *              加进入，不小于当前串即可
 *
 */
public class maxSon {

    public  static  int getMaxSon(int[] arr){
        int maxSum = arr[0];
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            if(currSum+arr[i] > arr[i]){
                currSum = currSum+arr[i];
            }else {
                currSum = arr[i];
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {1,4,-8,4,-3,6};
        int sum = getMaxSon(array);
        System.out.println(sum);
    }
}
