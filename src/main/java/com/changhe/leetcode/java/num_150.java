package com.changhe.leetcode.java;

import java.util.Stack;

public class num_150 {

    //逆波兰表达式
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String  s : tokens){
            if(s.equals("+") || s.equals("-")|| s.equals("*")||s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int c = 0;
                if(s.equals("+")){
                    c = a + b;
                }
                if(s.equals("-")){
                    c = b - a;
                }
                if(s.equals("*")){
                    c = b * a ;
                }
                if(s.equals("/")){
                    c = b / a;
                }
                stack.push(c);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] tokens = new String[]{"2","1","+","3","*"};
        String[] tokens1 = new String[]{"4","13","5","/","+"};
        System.out.println(evalRPN(tokens1));
    }
}
