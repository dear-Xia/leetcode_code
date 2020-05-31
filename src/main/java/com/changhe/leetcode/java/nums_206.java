package com.changhe.leetcode.java;

import javax.sound.midi.MidiChannel;

public class nums_206 {
    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode flage = null;
        ListNode crr = head;
        while(crr != null){
            ListNode mind = crr.next;
            crr.next = flage;
            flage = crr;
            crr = mind;
        }

        return flage;
    }

    /**
     * 递归方法
     * @param head
     * @return
     */
    public   static  ListNode reverseList_1(ListNode head){

        return null;
    }

    public static void main(String[] args) {

    }
}
