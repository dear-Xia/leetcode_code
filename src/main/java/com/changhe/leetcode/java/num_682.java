package com.changhe.leetcode.java;

import java.util.Stack;

public class num_682 {
    /**
     * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
     * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
     * 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
     * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
     *
     * @param ops
     * @return
     */
    public static int calPoints(String[] ops) {
        int sum = 0;
        Stack<String> strings = new Stack<String>();
        for(String s : ops){
            if(s.equals("+")){
                String Otemp = strings.pop();
                String Ttemp = strings.pop();
                strings.push(Ttemp);
                strings.push(Otemp);
                strings.push(String.valueOf(Integer.valueOf(Otemp)+Integer.valueOf(Ttemp)));
                sum += Integer.valueOf(Otemp)+Integer.valueOf(Ttemp);
            }else if(s.equals("D")){
                String Dtemp = strings.pop();
                strings.push(Dtemp);
                strings.push(String .valueOf(Integer.valueOf(Dtemp)*2));
                sum += Integer.valueOf(Dtemp)*2;
            }else if(s.equals("C")) {
                sum -= Integer.valueOf(strings.pop());
            }else{
                int tem = Integer.valueOf(s);
                strings.push(s);
                sum += tem;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        String[] s = {"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }
}
