package com.changhe.leetcode.java;

public class num_91 {
    //解码方法

    /**
     * a-1
     * b-2
     *
     * y-25
     * z-26
     * @param s
     * @return
     * 当前i位置，有多少种解码方法，取决于，当前的结果是否可以并入其哪一个，如果可以并入前一个，则扽并于fi-1,如果不可以并入，则等于fi-2
     */
    public static int numDecodings(String s) {
        int length = s.length();
        int nums = 0;
        int a = 0,b=0,c=0;
        if(s.substring(0,1).equals("0")){
            return 0;
        }else {
            nums+=1;
        }
        for(int i=1;i<length;i++){
            if(s.substring(i-1,i).equals("0")){
                if(s.substring(i,i+1).equals("0")){
                    nums = 0;
                    break;
                }
            }else if(Integer.parseInt(s.substring(i-1,i+1))>=10 && Integer.parseInt(s.substring(i-1,i+1))<= 26){
                nums+=1;
            }
        }
        return nums;
    }
    public static int numDecodings1(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) != '0') {
                f[i] += f[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }
    public static void main(String[] args) {
        String s = "2101";
        System.out.println(numDecodings1(s));
        //2101
        /**
         * i = 0  2,1中  边界值
         * i=1, 21/2,1 2种     解释： 1>0,因此，1可以单独存在，同时21在1-26范围内，因此，i=1位置上，可以同时，因此，2种
         * i=2 2,10 1种，解释，因为0结尾，0不能单独出现，且能够和前面的结果合并，因此，只能等于i-2的结果
         * i=3，2101 解释： 1可以单独出现，且，前一个值为0，无法并入，因此，只有
         */
    }
}
