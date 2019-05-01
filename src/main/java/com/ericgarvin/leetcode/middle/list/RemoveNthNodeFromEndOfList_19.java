package com.ericgarvin.leetcode.middle.list;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthNodeFromEndOfList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preRoot = new ListNode(0);
        preRoot.next = head;
        ListNode first = preRoot;
        ListNode second = preRoot;
        for (int i = 0; i < n; i++) {
            second = second.next;
        }
        while (second.next != null) {
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;
        return preRoot.next;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        ListNode listNode = new RemoveNthNodeFromEndOfList_19().removeNthFromEnd(root, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
