package com.leetcode.secondquestion.one;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {//先进行形参的判断，提高执行效率
            return null;
        }
        if (l1 == null) {//因为上面判断了l1和l2，所以这里如果l1是null，那么l2必然有值，直接返回l2即可
            return l2;
        }
        if (l2 == null) {//理由同上
            return l1;
        }
        ListNode result = new ListNode(0);//
        ListNode temp = result;
        while (true) {
            if (l1 != null) {
                temp.val = temp.val + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp.val = temp.val + l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(temp.val / 10);
            temp.val = temp.val % 10;
            if (l1 == null && l2 == null) {
                temp.next = (temp.next.val == 0 ? null : temp.next);
                break;
            }
            temp = temp.next;
        }
        return result;

    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            ListNode listNode = this;
            stringBuilder.append("begin : ");
            stringBuilder.append("{" + listNode.val + ",");
            while (listNode.next != null) {
                stringBuilder.append(next.val + ",");
                listNode = listNode.next;
            }
            ;
            stringBuilder.append("}");
            String s = stringBuilder.toString();
            s = s.substring(0, stringBuilder.toString().length());
            return s;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new Solution().new ListNode(5);
        ListNode listNode2 = new Solution().new ListNode(6);
        listNode2.next = listNode1;
        System.out.println(listNode2.toString());
        ListNode listNode3 = new Solution().new ListNode(7);
        ListNode listNode4 = new Solution().new ListNode(8);
        listNode4.next = listNode3;
        System.out.println(listNode4.toString());
        ListNode listNode = new Solution().addTwoNumbers(listNode2, listNode4);
        System.out.println(listNode.toString());
    }
}