package com.changhe.leetcode.java;

public class num_7 {

    /**
     * 反转数字
     * @param x
     * @return
     */
    public static int reverse(int x) {
        if(x>230 || x<-231) {
            return 0;
        }
        int sum = 0;
        String s = "";
        if(x < 0){
            x = -x;
            int length = (s + x).length();
            while(length >0){
               sum = (sum+x%10)*10;
               x = x/10;
               length --;
            }
            return -sum;
        }else{
            int length = (s + x).length();
            while(length >=0){
                sum = (sum+x%10)*10;
                x = x/10;
                length --;
            }
            return sum;

        }


    }

    /*public  static  int getNum(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && pop > 7)) {
                return 0;
            }
            if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }*/

    public static void main(String[] args) {
        int reverse = reverse(-100);
        System.out.println(reverse);
    }
}
