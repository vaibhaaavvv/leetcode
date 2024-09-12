package com.stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        reverseTheStack(stack);
        System.out.println(stack);
    }

    private static void reverseTheStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int top = stack.pop();
        reverseTheStack(stack);
        pushAtBottom(top, stack);
    }

    private static void pushAtBottom(int newValue, Stack<Integer> stack) {
        if(stack.isEmpty()) {
            stack.push(newValue);
            return;
        }
        int top = stack.pop();
        pushAtBottom(newValue, stack);
        stack.push(top);

    }
}
