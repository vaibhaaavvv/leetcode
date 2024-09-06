package com.stack;

public class ImplementStack {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public ImplementStack() {
        this.head = null;
    }

    public void push(int x) {
        Node node = new Node(x);
        if (this.head == null)
            this.head = node;
        else {
            Node currentHead = this.head;
            this.head = node;
            this.head.next = currentHead;
        }
    }

    public int pop() {
        if(this.empty())
            return Integer.MIN_VALUE;
        Node poppedValue = this.head;
        this.head = head.next;
        return poppedValue.data;
    }

    public int top() {
        if(this.empty())
            return Integer.MIN_VALUE;
        return this.head.data;
    }

    public boolean empty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        ImplementStack obj  = new ImplementStack();
        obj.push(1);
        obj.push(2);
        int topVal = obj.top();
        int popVal = obj.pop();
        boolean checkEmpty = obj.empty();
    }
}
