package StackAndQueue.Impl;

public class StackImpls {
    /*
     * LIFO manner -> so keep track of last element -> use top as the tracker -> set to -1
     */
    public static class ArrayStack {
        int size = 1000;
        int[] arr = new int[size];
        int top = -1;


        void push(int num) {
            ++top;
            arr[top] = num;
        }

        int pop() {
            int elem = arr[top];
            top--;
            return elem;

        }

        int top() {
            return arr[top];
        }

        int size() {
            return top + 1;
        }
    }
    public static class LinkedStack {
        
    }

}
