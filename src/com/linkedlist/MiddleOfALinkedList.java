package com.linkedlist;

public class MiddleOfALinkedList extends ListNode {
    public ListNode middleNode(ListNode head) {
        int length = calculateLength(head);
        int middleIndex = 0;

        ListNode targetNode = head;
        while (middleIndex < length / 2) {
            targetNode = targetNode.next;
            middleIndex++;
        }

        return targetNode;
    }

    public int calculateLength(ListNode head) {
        if (head.next == null)
            return 1;
        ListNode currentNode = head;
        int len = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            len++;
        }
        return len;
    }
}
