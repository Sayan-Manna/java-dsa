package StackAndQueue.Impl;

import java.util.Stack;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class CustomStack {
    Stack<Pair> stack;
    public CustomStack() {
        stack = new Stack<>(); // ArrayDequeue does not support random access or null elements. -> peek().x, peek().y not good fit here
    }

    public void push(int val) {
        int min = 0;
        if (stack.isEmpty()) {
            min = val;
        }else {
            min = Math.min(stack.peek().y, val);
        }
        stack.push(new Pair(val, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().x;
    }

    public int getMin() {
        return stack.peek().y;
    }
}

public class MinStack {
    public static void main(String[] args) {
        CustomStack minStack = new CustomStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Current Min: " + minStack.getMin()); // -3

        minStack.pop();
        System.out.println("Top Element: " + minStack.top());    // 0
        System.out.println("Current Min: " + minStack.getMin()); // -2

        minStack.push(-5);
        System.out.println("Top Element: " + minStack.top());    // -5
        System.out.println("Current Min: " + minStack.getMin()); // -5
    }
}