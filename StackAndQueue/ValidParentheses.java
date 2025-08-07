package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {
    private static boolean isValidParentheses(String s) {

        // Stack elegant solution
        Deque<Character> st = new ArrayDeque<>(); // Or Stack but ArrayDeque is more efficient
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            /*
            * For all other cases (when any closing bracket)
            * 1. If stack is empty -> return false -> as there is no matching opening bracket
            * 2. If stack is not empty and top of the stack is not matching -> return false as no matching opening bracket
            * 3. If stack is not empty and top of the stack is matching -> pop the top element
            * 4. eventually stack will be empty and return true
             */
            // In this line when checking st.pop() != c -> it actually pops the top element -> if matches then also element will be removed if not false returned
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();

        // Stack based --------------------O(N) | O(N)
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//                st.push(s.charAt(i));
//            } else {
//                // Edge case : when there is only closing bracket -> if starting closing -> directly return false as not valid
//                if (st.isEmpty()) return false;
//
//                char popped = st.pop();
//
//                if ((s.charAt(i) == ')' && popped != '(') || (s.charAt(i) == '}' && popped != '{') || (s.charAt(i) == ']' && popped != '[')) {
//                    return false;
//                }
//            }
//        }
//        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValidParentheses(s));

    }
}
