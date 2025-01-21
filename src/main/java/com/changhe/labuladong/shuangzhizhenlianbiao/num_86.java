package com.changhe.labuladong.shuangzhizhenlianbiao;



public class num_86 {
    /**
     * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
     *
     * 你应当 保留 两个分区中每个节点的初始相对位置。
     */
    public static ListNode partition(ListNode head, int x) {
        //分解的链表1的虚拟头， 大于等于x
        ListNode dummy1 = new ListNode(-1);
        //分解的链表2的虚拟头, 小于x
        ListNode dummy2 = new ListNode(-1);

        ListNode p1 = dummy1, p2 = dummy2;
        ListNode p = head;
        while (p != null){
            if(head.val >= x){
                p1.next = p;
                p1 = p1.next;
            }else {
                p2.next = p;
                p2 = p2.next;
            }
            //不能直接让p指针往前移动
            //断开原链表中的节点，否则会出现环的存在从而让循环变成无终止的状态
            ListNode temp = p.next;
            p.next  = null;
            p = temp;
        }
        p2.next = dummy1.next;
        return dummy2.next;
    }

    public static void main(String[] args) {

    }
}
