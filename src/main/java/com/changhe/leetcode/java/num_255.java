package com.changhe.leetcode.java;

import jdk.nashorn.internal.ir.CallNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**\
 * 使用队列实现堆栈
 */
public class num_255 {
   private Queue queue;
   private  Integer flage;

    /** Initialize your data structure here. */
    public num_255() {
        queue = new LinkedList<Integer>();
    }


    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        flage = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    /**
     * 这里是使用的队列完成的
     * 那么这里的思路就是：
     *  首先队列是先进先出的，所以要获取栈顶，就需要将队列全部入队一次，将最后一次的
     *  入队元素返回就好了
     * @return
     */
    public int pop() {
        int size = queue.size();
        for (int i = 0; i < size - 2; i++) {
            queue.add(queue.remove());
        }
        flage = (Integer) queue.remove();
        queue.add(flage);
        return (Integer) queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return flage;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
    @Test
    public  void test(){

    }
}
