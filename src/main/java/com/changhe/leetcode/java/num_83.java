package com.changhe.leetcode.java;

import javafx.scene.shape.CubicCurve;

import java.sql.SQLOutput;
import java.util.List;

/**
 * 删除链表中的重复元素
 */
public class num_83 {
    /**
     * 这个方法，有问题，这里只是针对有序结构，如果是
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    /**
     * 这个方法是处理无序的结构
     * @param head
     * @return
     */
    public static  ListNode deleteNode(ListNode head){
        ListNode newNode = head;
        String flage = "";
        if(head == null){
            return  head;
        }
        flage += head.val;
        while (head.next != null){
            if(!flage.contains(""+head.next)){
                newNode.next = head.next;
            }else {
                head = head.next;
            }
        }
        return  newNode;
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

        ListNode head = deleteDuplicates(n1);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
