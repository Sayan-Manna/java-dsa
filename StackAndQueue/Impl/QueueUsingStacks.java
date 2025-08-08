package StackAndQueue.Impl;

import java.util.Stack;

class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public MyQueue() {}

    void push(int x) {

    }
    

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
