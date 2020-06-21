package com.changhe.leetcode.java;

import java.util.Stack;
import java.util.logging.StreamHandler;

/**
 *
 * 比较含退格的字符串
 */
public class num_844 {
    /**
     * #表示退格，意思就是出现一个这个，就要将之前的一个字符删掉
     * @param S
     * @param T
     * @return
     */
    public static boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    public static  String getString(String s){
        Stack<Character> characters = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == '#'){
                if(!characters.empty()){
                    characters.pop();
                }
            }else {
                characters.push(c);
            }
        }
        return String.valueOf(characters);
    }

    public static void main(String[] args) {
        String s = "a##c";
        String t = "b##c";
        System.out.println(backspaceCompare(s,t));
    }
}
