package StackAndQueue.Impl;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {}
    // Approach 2 : O(1) | O(2N)
    void push(int x) {
        // #2 : x -> s1
        stack1.push(x);
    }
    int pop() {
        if (stack2.isEmpty()) {
            // s1 -> s2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    int peek() {
        if (stack2.isEmpty()) {
            // s1 -> s2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    /*
    * push(1);  // stack1: [1], stack2: []
    * push(2);  // stack1: [1, 2], stack2: []
    * size();   // returns 0 ❌ but actually queue size = 2
    */
    int size() {
        return stack2.size() + stack1.size();
    }


    // Approahc 1 : O(2N) in push | O(2N) SC
//    void push(int x) {
//        // #1 : s1 -> s2
//        while (!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        // #2 : x -> s1
//        stack1.push(x);
//        // #3 : s2 -> s1
//        while (!stack2.isEmpty()) {
//            stack1.push(stack2.pop());
//        }
//    }
//    int pop() {
//        if (stack1.isEmpty()) {
//            System.out.println("Stack is empty");
//        }
//        return stack1.pop();
//    }
//    int peek() {
//        return stack1.peek();
//    }
//    int size() {
//        return stack1.size();
//    }
}

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
