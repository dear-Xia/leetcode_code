package com.changhe.leetcode.java;

import java.math.BigInteger;
import java.util.Stack;

public class num_227 {
    /**
     *中序表达式计算结果
     * @param s
     * @return
     */
    public static int calculate(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> flages = new Stack<>();
        String[] split = s.split(" ");
        Integer result = 0;
        for(String ss:split){
            if(ss.equals("+") || ss.equals("-") || ss.equals("*") || ss.equals("/")){
                if(flages.empty()){
                    flages.push(ss);
                }
            }else {
                nums.push(Integer.parseInt(ss));
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
