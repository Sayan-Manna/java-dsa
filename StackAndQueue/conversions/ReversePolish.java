package StackAndQueue.conversions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class ReversePolish {
  private static int evaluateExpression(String[] tokens) {
    // Optimal
    Deque<Integer> stack = new ArrayDeque<>();

    for (String token : tokens) {
      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        int b = stack.pop(); // right operand
        int a = stack.pop(); // left operand
        int res = 0;
        switch (token) {
          case "+":
            res = a + b;
            break;
          case "-":
            res = a - b;
            break;
          case "*":
            res = a * b;
            break;
          case "/":
            res = a / b;
            break;
        }
        stack.push(res);
      } else {
        stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop();

    // Brute-force
    // List<String> list = new ArrayList<>(Arrays.asList(tokens));
    // // continue until only 1 element (final res) remains in the list
    // while (list.size() > 1) {
    // // Iterate the list to find 1st operator
    // for (int i = 0; i < list.size(); i++) {
    // String token = list.get(i);
    // // check if the current token is an operator
    // if (token.equals("+") || token.equals("-") || token.equals("*") ||
    // token.equals("/")) {
    // /*
    // * FOUND AN OPERATOR
    // * IN RPN : the operands for an operator are always immediately before it
    // * 1st operand is always i-2-th
    // */
    // int operand1 = Integer.parseInt(list.get(i - 2));
    // int operand2 = Integer.parseInt(list.get(i - 1));

    // int res = 0;
    // if (token.equals("+")) {
    // res = operand1 + operand2;
    // } else if (token.equals("-")) {
    // res = operand1 - operand2;
    // } else if (token.equals("*")) {
    // res = operand1 * operand2;
    // } else if (token.equals("/")) {
    // res = operand1 / operand2;
    // }

    // /*
    // * Now that we have formed one expression
    // * Remove the operands and operator
    // */
    // list.remove(i); // operator
    // list.remove(i - 1);
    // list.remove(i - 2);

    // // Insert the res at the position of the 1st operand
    // list.add(i - 2, String.valueOf(res));
    // break;
    // }
    // }
    // }
    // return Integer.parseInt(list.get(0));
  }

  public static void main(String[] args) {
    String[] token = { "4", "13", "5", "/", "+" };

    System.out.println(evaluateExpression(token));
  }
}
