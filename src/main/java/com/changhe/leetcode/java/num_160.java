package com.changhe.leetcode.java;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 寻找两个链表的交点
 */
public class num_160 {
    /**
     *利用set结构，存储节点
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> listNodes = new HashSet<ListNode>();
        if(headA == null || headB == null)
            return null;

        while (headA != null){
            listNodes.add(headA);
            headA = headA.next;
        }

        while (headB != null){
            if(listNodes.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;

    }

    /**
     * 方法二是让两个链表对齐后再去
     * 使用两个指针，同时下移
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        while (headA != null){
            lengthA++;
            headA = headA.next;
        }
        while (headB != null){
            lengthB++;
            headB = headB.next;
        }
        //对齐方式有问题，再思考
        return  null;

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

        ListNode N1 = new ListNode(1);
        ListNode N2 = new ListNode(1);
        ListNode N3 = new ListNode(1);

        N1.next =N2;
        N2.next = N3;
        N3.next = n4;

        ListNode intersectionNode = getIntersectionNode(n1, N1);

        System.out.println(intersectionNode.val);

    }
}
