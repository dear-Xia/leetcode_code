package com.changhe.bull.online.huawei;

import java.util.List;
import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode head = null;
        do {
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            ListNode listNode = new ListNode(Integer.valueOf(line));
            add(listNode,head);

        }while (true);

        while (head!= null){
            System.out.println(head.val);
        }

    }
    public static void add(ListNode list,ListNode head){

        list.next = head;
        head = list;

    }

    //反转链表
    public static void turnListNode(ListNode head){
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null){
            head.next = pre;
            pre = curr;
            curr = curr.next;
        }
    }
}

/**
 * 链表定义
 */
class  ListNode{
     int val;
     ListNode next;
     //构造函数
     ListNode(int x){
         val = x;
     }
}

