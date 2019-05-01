package com.ericgarvin.leetcode.middle;

/**
 * 2.两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class TwoNumSum_2 {
    private ListNode ListNode;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnList = new ListNode(0);
        ListNode p = l1, q = l2, curr = returnList;
        int increaseFlag = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = increaseFlag + x + y;
            increaseFlag = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (increaseFlag > 0) {
            curr.next = new ListNode(increaseFlag);
        }
        return returnList.next;
    }

    public static void main(String[] args) {
        ListNode headListA = new ListNode(9);
        headListA.next = new ListNode(7);
        headListA.next.next = new ListNode(5);

        ListNode headListB = new ListNode(6);
        headListB.next = new ListNode(4);
        headListB.next.next = new ListNode(7);

        TwoNumSum_2 twoNumSum2 = new TwoNumSum_2();
        ListNode listNode = twoNumSum2.addTwoNumbers(headListA, headListB);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}

