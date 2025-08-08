package StackAndQueue.Impl;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

class stack {

    Queue<Integer> queue = new LinkedList<>();
    // 1 Queue approach :
//    void push(int num) {
//        queue.add(num);
//        // shift all elements to the right
//        /*
//        * start from 0 till before the last number that gets pushed
//        * now we need to pop them out one by one and add to queue one by one
//        * `queue.add(queue.poll())`
//        */
//        for (int i=0; i<queue.size()-1; i++) {
//            queue.add(queue.remove());
//        }
//    }
//    int pop() {
//        return queue.remove();
//    }
//    int top() {
//        if (queue.isEmpty()) {
//            throw new NoSuchElementException("Stack is empty");
//        }
//        return queue.peek();
//    }
//    int size() {
//        return queue.size();
//    }


    // 2 Queue approach :
    Queue<Integer> queue2 = new LinkedList<>();
    public stack() {
        queue = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    void push(int num) {
        // Push to 2nd q
        queue2.offer(num);
        // move all elements from q1 to q2 after the top pushed element
        /*
        * 
        */
        while (!queue2.isEmpty()) {
            queue2.offer(queue.poll());
        }
        // Swap references
        Queue<Integer> temp = queue;
        queue = queue2;
        queue2 = temp;
    }
    int pop() {
        return queue.remove();
    }
    int top() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return queue.peek();
    }
    int size() {
        return queue.size();
    }

}
public class StackUsingQueue {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}
