package com.changhe.leetcode.java;

public class num_475 {
    /**
     *返回最小半径
     * 条件：
     *
     * @param houses
     * @param heaters
     * @return
     */
    public static  int findRadius(int[] houses, int[] heaters) {
        if(heaters.length == 1){
            return  Math.max(Math.abs(heaters[0]-houses[0]),Math.abs(heaters[0]-houses[-1]));
        }
        int follower = 0;
        int forward = 1;
        int max_Length = 0;
        for(int i=0 ;i<houses.length;i++){
            if(houses[i]>heaters[follower]){
                max_Length = Math.max(max_Length,Math.abs(houses[i]-heaters[follower]));
                follower++;
                forward++;
            }else if(houses[i] == heaters[follower]){
                if(heaters[forward]>houses[-1]){
                    max_Length = Math.max(max_Length,Math.abs(houses[-1] - heaters[follower]));
                }else{
                    max_Length = Math.max(max_Length,(heaters[follower]-heaters[follower])/2);
                }

            }else {
                max_Length = Math.max(max_Length,Math.abs(heaters[follower]-houses[i]));

            }
        }

        return  max_Length;
    }


    public static void main(String[] args) {
        int[] house = {1,2,3,4};
        int[] heart = {1};
        int flage = findRadius(house,heart);
        System.out.println(flage);
    }
}
