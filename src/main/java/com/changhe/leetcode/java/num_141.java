package com.changhe.leetcode.java;

import sun.text.resources.et.FormatData_et;

import java.util.HashSet;
import java.util.List;

/**
 * 反思自己的代码为什么会超时，同样的代码逻辑！！！
 */
public class num_141 {
    /**
     * 第一个方法
     * 采用set结构存储
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        /*HashSet<ListNode> listNodes = new HashSet<ListNode>();
        int x = 0;
        ListNode current = head;
        while (current != null && current.next != null){
            listNodes.add(current);
            x++;
            current = current.next;
        }
        if(x > listNodes.size()){
            return true;
        }else {
            return false;
        }*/
        HashSet<ListNode> listnodes = new HashSet<ListNode>();
        while (head != null){
            if(listnodes.contains(head)){
                return true;
            }else {
                listnodes.add(head);
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 第二个方法
     * 采用快慢指针
     * @param head
     * @return
     */
    public static boolean hasCycle_1(ListNode head) {
       /* ListNode slow = head.next;
        ListNode fast = head.next.next;
        boolean flage = false;
        while (fast.next != null && fast != null){
            if(slow == fast){
                flage = true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return flage;*/
       if(head == null || head.next == null ){
           return false;
       }
       ListNode slow = head;
       ListNode fast = head.next;
       while (slow != fast){
           if(fast == null || fast.next == null){
               return false;
           }

           slow = slow.next;
           fast = fast.next.next;
       }
       return true;
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(hasCycle_1(n1));

    }
}
