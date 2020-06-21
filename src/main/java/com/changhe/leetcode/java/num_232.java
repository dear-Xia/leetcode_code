package com.changhe.leetcode.java;

import java.util.Stack;

/**
 * 用栈模拟队列
 */
public class num_232 {
    //第一次导入的栈
    private  Stack<Integer> stack_1 = new Stack<Integer>();
    //调整循序的栈
    private  Stack<Integer> stack_2 = new Stack<Integer>();
    private int flage = 0;
    public num_232() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack_1.empty())
            flage = x;
        stack_1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack_1.empty()){
            stack_2.push(stack_1.pop());
        }
        int out = stack_2.pop();
        flage = stack_2.peek();
        while (!stack_2.empty()){
            stack_1.push(stack_2.pop());
        }
        return out;
    }

    /** Get the front element. */
    public int peek() {
        return flage;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack_1.empty();
    }
}
