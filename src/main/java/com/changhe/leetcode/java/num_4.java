package com.changhe.leetcode.java;

public class num_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0){
            return 0;
        }
        if(nums1.length == 0){
            if(nums2.length%2 == 0){
                return (nums2[nums2.length/2] + nums2[nums2.length/2 - 1])/2;
            }else {
                return nums2[nums2.length/2];
            }
        }
        if(nums2.length == 0){
            if(nums1.length%2 == 0){
                return (nums1[nums1.length/2] + nums1[nums1.length/2 - 1])/2;
            }else {
                return nums1[nums1.length/2];
            }
        }
        int i=0,j=0,flage=-1;
        if((nums1.length+nums2.length)%2 == 0){
            int k = (nums1.length+nums2.length)/2;
            double kd = 0;
            int o = (nums1.length+nums2.length)/2 -1;
            double result = 0;
            while (flage<=k || flage<= o){
                if(flage == o){
                    result += kd;
                }
                if(flage == k){
                    result += kd;
                    break;
                }
                if (nums1[i] <= nums2[j] && i<nums1.length) {
                    kd = nums1[i];
                    i++;
                    flage++;
                } else {
                    kd = nums2[j];
                    j++;
                    flage++;
                }
            }
            return result/2;
        }else {
            int k = (nums1.length+nums2.length)/2;
            double result = 0;
            while (flage<=k){
                if(flage == k){
                    break;
                }else {
                    if (nums1[i] <= nums2[j]) {
                        result = nums1[i];
                        flage++;
                    } else {
                        result = nums2[j];
                        j++;
                        flage++;
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        findMedianSortedArrays(a,b);
    }
}
