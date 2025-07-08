package StackAndQueue.Impl;


public class StackImplUsingArrays {
    public static void main(String[] args) {
        StackImpls.ArrayStack st = new stack();
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
