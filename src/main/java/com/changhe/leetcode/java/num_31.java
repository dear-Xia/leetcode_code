package com.changhe.leetcode.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class num_31 {
    public static void nextPermutation(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        if(nums.length==2){
            a = nums[1];
            nums[1] = nums[0];
            nums[0] = a;
        }
        if(nums.length == 3){
            int reval = 0;
            if(nums[1]<nums[2]){
                a = nums[2];
                nums[2] = nums[1];
                nums[1] = a;
                reval++;
            }else if(nums[1]>nums[0]){
                if(nums[0]<nums[2]){
                    a = nums[0];
                    nums[0] = nums[2];
                    nums[2] = nums[1];
                    nums[1] = a;
                    reval++;
                }else{
                    a = nums[0];
                    nums[0] = nums[1];
                    nums[1] = nums[2];
                    nums[2] = a;
                    reval++;
                }
            }
            if(reval == 0){
                a = nums[0];
                nums[0] = nums[2];
                nums[2] = a;
            }

        }
        if(nums.length>3){
            int reval = 0;
            for(int i = nums.length-1;i>=2;i--){
                a = nums[i];
                b = nums[i-1];
                c = nums[i-2];
                if(a>b){
                   nums[i] = b;
                   nums[i-1] = a;
                   reval ++;
                   break;
                }
                if(b>c){
                    for(int j = nums.length-1;j>= i-1;j--){
                        if(c<nums[j]){
                            nums[i-2] = nums[j];
                            nums[j] = c;
                            reval++;
                            break;
                        }
                    }
                    int flage = 0;
                    for(int k = i-1;k< i-1+(nums.length-i+1)/2;k++){
                        a = nums[k];
                        b = nums[nums.length-1-flage];
                        nums[k] = b;
                        nums[nums.length-1-flage] = a;
                        flage++;
                    }
                    if(reval>0){
                        break;
                    }
                }
            }
            if(reval == 0){
                //倒叙
                for(int i=0;i<nums.length/2;i++){
                    a = nums[i];
                    b = nums[nums.length-1-i];
                    nums[i] = b;
                    nums[nums.length-1-i] = a;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,7,5,3,2};
        int[] nums1 = {2,2,0,4,3,1};
        int[]nums2 = {3,2,1};
        nextPermutation(nums);
    }
}
