package com.changhe.leetcode.java;


public class num_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return  l2;
        }
        if(l2 == null){
            return l1;
        }
        while (l1.next == null && l2.next == null){
            if((l1.val+l2.val) >=10){

            }
        }
        return  null;
    }
}

class  ListNode{
    int val;
    ListNode next;
    //构造函数
    ListNode(int x){
        val = x;
    }
}


