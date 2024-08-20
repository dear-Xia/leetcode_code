package com.changhe.leetcode.java;

public class num_97 {
    /**
     * 首先两个字符串可以分割为若干个子串，然后第三个字符串是由前两个字符串分割出来的子串交替组成
     * @param s1
     * @param s2
     * @param s3
     * @return
     * 题解：
     * s1  s2  s3
     * f(i,j)--s1的前i个元素  s2的前j个元素
     * 如果
     * f(i,j) = s3(i+j)
     * z表示当前是可以交替组成的
     *
     * 举例
     * aabcc      dbbca       aadbbcbcac
     *
     * s(1)  i=1,j=0   /i=0,j=1      a = a    i=1,j=0
     * s(2) s(1)+((i+1)/(j+1))       a = a    i=2,j=0
     * s(3) s(2)+((i+1)/(j+1))       d = d  i=2,j=1
     *
     *
     * s(i+j) = s(i+j-1)+((i-1)/(j-1))
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length() != s3.length()){
            return false;
        }
        boolean flage = true;
        int i=0,j=0;
        for(int s = 0;s<s3.length();s++){
            if(s3.charAt(s) == s1.charAt(i) && i<s1.length()-1){
                i++;
            }else {
                if(s3.charAt(s) == s2.charAt(j) && j<s2.length()-1){
                    j++;
                }else {
                    flage = false;
                    break;
                }
            }
        }
        return flage;
    }

    /**
     * 这里的思路和上面是一样的，只是构建了一个二维数组，用来存储每一个i和j对应的情况，好想法
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public static boolean isInterleave1(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[][] f = new boolean[n + 1][m + 1];

        f[0][0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[i][j] = f[i][j] || (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[n][m];
    }

    /**
     * 这就很有意思了，这里其实是换了个角度，，上面的是关注的s1和s2，这里聚焦的是s3
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public static boolean isInterleave2(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[] f = new boolean[m + 1];

        f[0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[j] = f[j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                if (j > 0) {
                    f[j] = f[j] || (f[j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[m];
    }
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));
    }
}
