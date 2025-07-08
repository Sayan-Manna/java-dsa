package StackAndQueue.Impl;

public class StackImpls {
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

}
