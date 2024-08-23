package com.changhe.leetcode.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num_131 {
    public  static boolean [][] f;
    public static  List<List<String>> ret = new ArrayList<>();
    public  static List<String> ans = new ArrayList<>();
    public static  int n;
    /**
     * 分割回文
     * 不会，看题解，总结
     *   回溯+动态规划  去枚举出所有的可能分割
     *
     *
     * @param s
     * @return
     */
    public static List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        //设置边界值,只有一个的时候每一个都是回文
        for(int i=0;i<n;++i){
            Arrays.fill(f[i],true);
        }
        //双循环，将二维数组覆盖所有值，给出所有i和j对应的子串是否可以为回文
        for(int i=n-1;n>=0;--i){
            for(int j=i+1;j<n;j++){
                f[i][j] = (s.charAt(i) == s.charAt(j) && f[i+1][j-1]);
            }
        }
        dfs(s,0);
        return ret;

    }
    //这里就是回溯算法了
    public static void dfs(String s,int i){
        //扫描到了最后一个位置，返回一个序列，这是其中一种分割方案
        if(i == n){
            ret.add(new ArrayList<String>(ans));
        }
        for(int j=i;j<n;j++){
            if(f[i][j]){
                ans.add(s.substring(i,j+1));
                dfs(s,j+1);
                ans.remove(ans.size()-1);
            }
        }
    }

    /**
     * aabd
     * i=0,j=o,ans-a
     *        i=1,j=1,ans
     * @param args
     */
    public static void main(String[] args) {
        String s = "aabd";
        partition(s);
    }
}
