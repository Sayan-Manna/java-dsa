package Recursion;

import java.util.Stack;

// Given a stack, the task is to sort it such that the top of the stack has the greatest element.
/*
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 */

public class SortStack {
    private static Stack<Integer> sortStack(Stack<Integer> stack) {

        // Recursive


        // Iterative - aux space : TC : O(n^2) SC : O(n)
        /* Don't think about reverse
         * stack is LIFO -> so everytime you push an element, it goes to the top
         * so if you want to sort in ascending order, you need to make sure that the smaller elements are at the bottom
         */
//        Stack<Integer> temp = new Stack<>();
//        while (!stack.isEmpty()) {
//            int curr = stack.pop();
//            while (!temp.isEmpty() && temp.peek() > curr) {
//                stack.push(temp.pop());
//            }
//            temp.push(curr);
//        }
//        return temp;

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> mod = new Stack<>();

        stack.push(41);
        stack.push(3);
        stack.push(33);
        stack.push(2);
        stack.push(11);

        mod = sortStack(stack);
        System.out.println(mod.toString());

    }

}
