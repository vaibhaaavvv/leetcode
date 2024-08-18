package com.linkedlist;


//Solution for 707 Design a linked list
class MyLinkedList {

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    int length;
    Node head;

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    public int get(int index) {
        if (length > index && index >= 0) {
            Node cur = head;
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    return cur.val;
                }
                cur = cur.next;
            }
            return -1;
        } else
            return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node currentNode = head;
        if (length == 1) {
            head.next = newNode;
            length++;
            return;
        } else {
            int i = 0;
            while (i < length - 1) {
                currentNode = currentNode.next;
                i++;
            }
            if (currentNode != null)
                currentNode.next = newNode;
            else
                head = newNode;
            length++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < length) {
            if (index == 0) {
                addAtHead(val);
            } else if (index == length)
                addAtTail(val);
            else {
                Node toBeAdded = new Node(val);
                int i = 0;
                Node current = head;
                while (i < index - 1) {
                    current = current.next;
                    i++;
                }
                Node temp = current.next;
                current.next = toBeAdded;
                toBeAdded.next = temp;
            }
            length++;
        } else if (index == length) {
            addAtTail(val);
        }
    }

    public void deleteAtIndex(int index) {
        if (index < length) {
            if (index == 0) {
                head = head.next;
            } else {
                int i = 0;
                Node current = head;
                while (i < index - 1) {
                    current = current.next;
                    i++;
                }
                Node toBeDeleted = current.next;
                current.next = toBeDeleted.next;
            }
            length--;
        }
    }

    public static void main(String... args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtIndex(0, 10);
        obj.addAtHead(7);
        obj.addAtHead(2);
        obj.addAtHead(1);
        obj.addAtIndex(3, 0);
        obj.deleteAtIndex(2);
        obj.addAtHead(6);
        obj.addAtTail(4);
        obj.get(4);
    }
}

