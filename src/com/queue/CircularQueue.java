package com.queue;

import java.util.*;

public class CircularQueue {
    int [] arr ;
    int rear ;
    int front;
    int size ;
    public CircularQueue(int k) {
        this.arr = new int[k];
        this.rear = -1;
        this.front = -1;
        this.size = k;
    }

    public boolean enQueue(int value) {
        //if queue is empty
        if (isEmpty()){
            arr[0] = value;
            front++;
            rear++;
            return true;
        }

        if(isFull())
            return false;

        if ((rear + 1) == size){
            arr[0] = value;
            rear = 0;
        } else{
            arr[rear+1] = value;
            rear++;
        }
        return true;
    }

    public boolean deQueue() {
        //already empty list
        if(isEmpty())
            return false;

        // only one element
        if(front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        front++;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return arr[front];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue(2);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.enQueue(2));
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(3));
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(3));
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(3));
        System.out.println(obj.deQueue());
        System.out.println(obj.Front());
    }

}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */