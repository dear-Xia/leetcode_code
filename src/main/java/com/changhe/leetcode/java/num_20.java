package com.changhe.leetcode.java;

import java.util.Stack;

/**
 * 判断括号的正确与否
 */
public class num_20 {
    /**
     * 栈的完成，包括三种括号，大中小
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(ch == '(' || ch == '[' || ch == '{'){
                characters.push(ch);
            }else {
                if(characters.empty()){
                    return false;
                }else {
                    char flage = characters.pop();
                    if (ch == ')' && flage == '(' ||
                            ch == ']' && flage == '[' ||
                            ch == '}' && flage == '{') {
                        continue;
                    } else
                        return false;
                }
            }
        }
        return characters.empty();
    }
    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
}
