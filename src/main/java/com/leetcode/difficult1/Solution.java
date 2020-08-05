package com.leetcode.difficult1;

public class Solution {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        //定义一个新链表
        ListNode dummy = new ListNode(0);
        //新链表的下一级为head
        dummy.next = head;
        //定义两个指针
        ListNode pre = dummy;
        ListNode end = dummy;
        //当结束指针的下一级不等于空的时候，执行循环
        while (end.next != null) {
            //获取k最后一个链表，赋值给end指针
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            //如果end等于空，代表链表数量小于k值
            if (end == null) {
                break;
            }
            //start等于链表头
            ListNode start = pre.next;
            //next等于第k个链表
            ListNode next = end.next;
            //end的下一链表置为空
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }
}
