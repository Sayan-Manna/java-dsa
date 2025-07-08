package StackAndQueue.Impl;


public class StackImplUsingArrays {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(6);
        st.push(3);
        st.push(2);
        System.out.println("Top of the stack before deleting any element " + st.top());
        System.out.println("Size of the stack before deleting any element " + st.size());
        System.out.println("The element deleted is " + st.pop());
        System.out.println("Size of the stack after deleting an element " + st.size());
        System.out.println("Top of the stack after deleting an element " + st.top());
    }
}
/*
 * LIFO manner -> so keep track of last element -> use top as the tracker -> set to -1
 *
 */

class Stack {
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
