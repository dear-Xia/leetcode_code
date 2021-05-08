package com.changhe.leetcode.java;

public class num_125 {
    /**
     * 验证回文
     * 65-90  A-Z
     * 97-122 a-z
     * 30-39 0-9
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {

        if(s == null || s.length() == 0){
            return false;
        }
        boolean flage = true;
        s = s.toLowerCase().trim();

        int start = 0,end = s.length()-1;
        while (start <= end){
            char i = s.charAt(start);
            char j = s.charAt(end);
            if(isSuitable(i)&isSuitable(j)){
                if(!isSuitable(i)){
                if(i != j){
                    flage = false;
                    break;
                }}
                else {
                    start++;
                    end--;
                }
            }
            if(!isSuitable(i)&isSuitable(j)) {
                start++;
            }
            if(isSuitable(i)& !isSuitable(j)){
                   end--;
            }


        }

        return flage;
    }
    public  static  boolean isSuitable(char c){
        if(c<30 || c>122){
            return false;
        }else {
            if(c>39 && c<65 || c>90 && c<97){
                return false;
            }else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        String  test = "race a car";
        boolean result = isPalindrome(test);
        System.out.println(result);
    }
}
