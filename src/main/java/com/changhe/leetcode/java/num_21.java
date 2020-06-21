package com.changhe.leetcode.java;

import com.sun.org.apache.xml.internal.security.keys.content.RetrievalMethod;
import jdk.jfr.events.ErrorThrownEvent;

import java.util.ArrayList;

/**
 * 合并两个有序链表
 */
public class num_21 {
    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode prehead = new ListNode(-1);
       ListNode pre = prehead;
       while (l1 != null && l2 != null){
           if(l1.val <= l2.val){
               pre.next = l1;
               l1 = l1.next;
           }else{
               pre.next = l2;
               l2 = l2.next;
           }
           pre = pre.next;
       }
       pre.next = l1 == null  ? l2 : l1;
        return prehead.next;
    }

    /**
     * 使用递归
     * @param l1
     * @param l2
     * @return
     */
    public static  ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val <l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {

    }
}
