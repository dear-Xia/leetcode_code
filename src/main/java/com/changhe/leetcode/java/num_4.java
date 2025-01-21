package com.changhe.leetcode.java;

public class num_4 {
    /**
     * 二分的典型题目
     * @param nums1
     * @param nums2
     * @return
     */
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

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        boolean flage = false;
        int target = (l1+l2)/2;
        if((l1+l2)%2 == 0){
            flage = true;
        }
        return findTarget(nums1,nums2,target,flage);

    }
    public static double findTarget(int[] nums1, int[] nums2,int target , boolean flage){
        int flagea = 0, flageb = 0;
        int targeta = 0, targetb = 0;
        int flages = 0;
        while (flages<nums1.length + nums2.length-1){
            /*if(flages == target){
                targetb = nums1[flagea]<=nums2[flageb]?nums1[flagea]:nums2[flageb];
                break;
            }
            if(flages == target-1){
                targeta = nums1[flagea]<=nums2[flageb]?nums1[flagea]:nums2[flageb];
            }*/
            if(nums1[flagea] <= nums2[flageb]){
                flagea++;
            }else{
                flageb++;
            }
            flages++;
        }
        double res ;
        if(flage){
            res =  (targeta+targetb)/2;
        }else{
            res = targeta;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        double res = findMedianSortedArrays1(a,b);
        System.out.println(res);
    }
}
