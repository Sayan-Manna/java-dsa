package StackAndQueue.Impl;

public class StackImpls {
    /*
     * LIFO manner -> so keep track of last element -> use top as the tracker -> set to -1
     */
    public static class ArrayStack {
        private final int size = 1000;
        private final int[] arr = new int[size];
        private int top = -1;


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
    public static class LinkedListStack {
        // creating the stack node
        private class stackNode {
            int val;
            stackNode next;
            stackNode(int d) {
                val = d;
                next = null;
            }
        }
        stackNode top;
        int size;

        stack() {
            this.top = null;
            this.size = 0;
        }

        void stackPush(int x) {
            stackNode elemNode = new stackNode(x);
            elemNode.next = top; // structure top ---> [2] -> [1] -> null
            top = elemNode;
            System.out.println("pushed");
            size++;
        }
        int stackPop() {
            if (top == null) return -1;
            int topData = top.val;
            stackNode temp = top;
            top = top.next;
            return topData;

        }


    }

}
