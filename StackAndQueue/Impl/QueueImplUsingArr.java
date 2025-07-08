package StackAndQueue.Impl;

public class QueueImplUsingArr {
    Queue q = new Queue(6);
}

class Queue {
    int[] arr;
    int start, end, currSize, maxSize;

    // Default Queue constructor
    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 16;
    }
    // Queue with size constructor
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }



    void push(int num) {
        if (currSize == maxSize) {
            System.out.println("Queue is full");
            System.exit(1);
        }
        // if queue is empty or non empty -> position the start and end
        if (end == -1) {
            start = 0;
            end = 0;
        }else {
            end = (end + 1) % maxSize;
        }
        arr[end] = num;
        System.out.println("The element pushed is " + num);
        currSize++;
    }

    int pop() {
        if (start == -1) {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        }else{
            start = (start+1) % maxSize;
        }
        currSize--;
        return popped;
    }
    int top() {
        if (start == -1) {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        return arr[start];
    }
    int size() {
        return end - start +1;
    }
}