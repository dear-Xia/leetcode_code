package com.changhe.leetcode.java;

/**
 * 删除链表中的给定值的节点
 */
public class num_203 {
    public static ListNode removeElements(ListNode head, int val) {
        /*ListNode new_head = head;
        if(head == null)
            return null;
        while (head != null){
            if(val == head.val){
                new_head = head.next;
            }else {
                new_head.next = head.next;
            }
            head = head.next;
        }
        return  new_head;*/
        ListNode flage = new ListNode(0);
        flage.next = head;

        ListNode pre = flage,curr = head;
        while (curr != null){
            if(curr.val == val)
                pre.next = curr.next;
            else
                pre = curr;
            curr = curr.next;
        }
        return flage.next;
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

        ListNode result = removeElements(n1,4);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
