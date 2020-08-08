package com.changhe.leetcode.java;

public class num_9 {
    /**
     * 判断是否是回文数字
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        boolean flage = true;
        String s = ""+x;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                flage = false;
            }
        }
        return flage;
    }

    /**
     * 官网方法
     * @param
     */
    public static  boolean isPalindrome_1(int x){
        if(x<0 || x%10 ==0&& x!=0){
            return false;
        }

        int revertedNumber = 0;
        while (x>revertedNumber){
            revertedNumber = revertedNumber*10 + x%10;
            x /= 10;
        }


        return  x == revertedNumber || x == revertedNumber/10;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1));

        System.out.println(isPalindrome_1(12));
    }
}
