package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class num_139 {
    /**
     * 单词拆分
     * @param s
     * @param wordDict
     * @return
     * dp[i]--s的前i个元素组成的字符串s[0-i-1]能否被拆分成若干字典出现的单词
     * 从前往后计算考虑状态转移方程，每次转移的时候需要枚举包含位置i-1的最后一个单词，看它是否出现在字典种以及除去这部分的字符串是否合法
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {

    }
}
