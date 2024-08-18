package com.linkedlist;

public class ConvertBinaryToInt {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        //find the length of the linked list first
        int length = calculateLength(head);

        // now as you have length then multiply the elements with respective     powers of 2
        int sum = 0;
        ListNode currentNode = head;
        int index = length;
        while (index > 0) {
            sum += currentNode.val * Math.pow(2, index - 1);
            index--;
            currentNode = currentNode.next;
        }
        return sum;
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

    public static void main(String[] args) {
        ConvertBinaryToInt obj = new ConvertBinaryToInt();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0, new ListNode(1, null));

        obj.getDecimalValue(listNode);
    }
}
