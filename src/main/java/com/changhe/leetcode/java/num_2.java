package com.changhe.leetcode.java;


public class num_2 {
    /**
     * 思路分析
     * 整个题目分为三个情况，只需要要针对三个情况分别处理即可
     *  第一是p1空
     *  第二是p2空
     *  第三是p1和p2都不空
     *  针对上面三种情况里面还有一个情况，就是当前计算之前的一步计算结果是否大于9，因此设置一个标志位用来记录是否大于9
     *  所以整个逻辑就主要分为6个小的情况，p1或者p2空，放在一个里面来呈现
     *  if 存在空
     *      if 是否需要加1
     *          if 非空.val+1 >9
     *              非空.val = (非空.val+1) %10
     *          else
     *              非空.val = 非空.val+1
     *              标志位 = false
     *          p.next = 非空.val
     *      else
     *          p.next = 非空.val
     *      移动指针
     *  if 不存在空
     *      if 是否需要加1
     *            if p1.val+p2.val+1 >9
     *                 p1.val = (p1.val+p2.val+1) %10
     *             else
     *                 p1.val = p1.val+p2.val+1
     *                  标志位 = false
     *             p.next = p1.val
     *       else
     *              if p1.val+p2.val >9
     *                       p1.val = (p1.val+p2.val) %10
     *                       flage = true
     *               else
     *                       p1.val = p1.val+p2.val
     *                        标志位 = false
     *            p.next = p1.val
     *       移动指针
     *
     *
     * @param l1
     * @param l2
     * @return
     */
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = l1, p2 = l2;
        boolean flage = false;

         while (p1 != null || p2 != null){
            if(p1 == null){
                if(flage){
                    if(p2.val +1 >= 10){
                        p2.val = (p2.val+1)%10;
                    }else {
                        p2.val = p2.val+1;
                        flage = false;
                    }
                    p.next = p2;
                }else{
                    p.next = p2;
                }
                p2 = p2.next;
                p = p.next;
            }else if(p2 == null){
                if(flage){
                    if(p1.val +1 >= 10){
                        p1.val = (p1.val+1)%10;
                    }else {
                        p1.val = p1.val+1;
                        flage = false;
                    }
                    p.next = p1;
                }else{
                    p.next = p1;
                }
                p1 = p1.next;
                p = p.next;
            }else{
                if(flage){
                    if(p2.val + p1.val + 1 >= 10){
                        p2.val = (p2.val+ p1.val +1)%10;
                    }else {
                        p2.val = p2.val + p1.val + 1 ;
                        flage = false;
                    }
                    p.next = p2;
                }else{
                    if(p2.val + p1.val  >= 10){
                        p2.val = (p2.val + p1.val)%10;
                        flage = true;
                    }else{
                        p2.val = p2.val + p1.val ;
                    }
                    p.next = p2;
                }
                p1 = p1.next;
                p2 = p2.next;
                p = p.next;
            }

        }
        if (flage){
            ListNode tail = new ListNode(1);
            p.next = tail;
        }

        return  dummy.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9);
        ListNode a3 =  new ListNode(1);
        //ListNode a4 = new ListNode(9);
        //ListNode a5 = new ListNode(9);
        //ListNode a6 =  new ListNode(9);
        //ListNode a7 =  new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        //a3.next = a4;
        //a4.next = a5;
        //a5.next = a6;
        //a6.next = a7;

        ListNode b1 = new ListNode(1);
        //ListNode b2 = new ListNode(9);
        //ListNode b3 = new ListNode(9);
        //ListNode b4 =  new ListNode(9);
        //b1.next = b2;
        //b2.next = b3;
        //b3.next = b4;


        ListNode f = addTwoNumbers(a1, b1);

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


