package com.changhe.leetcode.java;

public class num_121 {
    /**
     * 蛮力法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length-1;i++){

            for(int j = i+1;j<prices.length;j++){
                if((prices[j]-prices[i])>max){
                    max = prices[j]-prices[i];
                }
            }
        }

        if(max<0){
            return 0;
        }else
            return max;

    }

    /**
     * 滑动窗口的概念
     * 意思就是第i天卖出的话，利润最大值为i天前的最低谷买入，所以这里的最大值就是i天的值，- i天前的最低值
     * @param prices
     * @return
     */
    public int maxProfit_1(int[] prices) {
        int max = 0;
        if(prices.length<=0){
            return max;
        }
        int min_Pre = prices[0];
        for(int i=0;i<prices.length;i++){
            if(min_Pre>prices[i]){
                min_Pre = prices[i];
            }
            if(max < prices[i]-min_Pre){
                max = prices[i]-min_Pre;
            }
        }

        return max;
    }

    /**
     * 动态规划,意义不大
     * @param prices
     * @return
     */
    public int maxProfit_2(int[] prices) {
        return 0;
    }

    public static void main(String[] args) {

    }
}
