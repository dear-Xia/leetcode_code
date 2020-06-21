package com.changhe.leetcode.java;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * 判断回文链表
 */
public class num_234 {
    /**
     * 转字符串或数组
     * 有问题，晚上回去研究一下
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        ArrayList<String > integers = new ArrayList<String>();
        int length = 0;
        while (head != null){
            integers.add(head.val+"");
            length++;
            head = head.next;
        }

        Object[] objects = integers.toArray();
        int start = 0;
        while (start != length-1 || start < length-1){
            if(objects[start] == objects[length-1]){
                start++;
                length--;
            }else {
                return false;
            }
        }
        return true;
    }

    /**
     * 复制到数组或列表
     * 使用双指针判断
     * @param head
     * @return
     */
    public static boolean isPalindrome_1(ListNode head){
        ArrayList<Integer> vals = new ArrayList<Integer>();

        ListNode current = head;
        while (current != null){
            vals.add(current.val);
            current = current.next;
        }

        int front = 0;
        int back = vals.size()-1;
        while (front <back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(isPalindrome(n1));

    }
}
