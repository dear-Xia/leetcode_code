package com.changhe.leetcode.java;

public class num_122 {

    public static int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int[] getGoods = new int[prices.length];
        getGoods[0] = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                getGoods[i] = prices[i]-prices[i-1]+getGoods[i-1];
            }else {
                getGoods[i] = getGoods[i-1];
            }
        }
        return getGoods[getGoods.length-1];

    }

    public static void main(String[] args) {

    }
}
