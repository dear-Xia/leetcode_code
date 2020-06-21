package com.changhe.leetcode.java;

public class num_876 {
    /**
     * 快慢指针
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null  && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode result = middleNode(n1);

        System.out.println(result.val);
    }
}
