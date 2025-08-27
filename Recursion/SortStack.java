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
    // Iterative
    Stack<Integer> sorted = new Stack<>();

    return sorted;

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
