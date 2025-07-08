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
        class stackNode {
            int val;
            stackNode next;
            stackNode(int d) {
                val = d;
                next = null;
            }
        }
        stackNode top;
        int size;

        LinkedListStack() {
            this.top = null;
            this.size = 0;
        }
        /*
        * top : null, size = 0
        * elemNode : [1]->null
        * elemNode.next = top :: [1] -> null
        * top = [1], size = 1
        -----
        * top : [1], size = 1
        * elemNode : [2] -> null
        * elemNode.next = top :: [2] -> [1] -> null;
        * top = [2], size = 2
         */
        public void stackPush(int x) {
            stackNode elemNode = new stackNode(x);
            elemNode.next = top; // structure top ---> [2] -> [1] -> null
            top = elemNode;
            System.out.println("pushed");
            size++;
        }
        /*
        * [2] -------------------> [1] -> x
          top (val: 2 return)
        * [2] -> [1] - >x
          top,tmp
        * [2] -> [1] -> x
          tmp    top
         */
        int stackPop() {
            if (top == null) return -1;
            int topData = top.val;
            stackNode temp = top;
            top = top.next;
            size--;
            return topData;

        }

        int stackSize() {
            return size;
        }
        boolean isStackEmpty() {
            return top == null;
        }
        void printStack() {
            stackNode curr = top;
            while (curr != null) {
                System.out.println(curr.val + " -> ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

}
