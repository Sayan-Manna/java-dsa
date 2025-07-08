package String;

import java.util.Stack;

/*
Given a valid parentheses string s, return the nesting depth of s.
The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3

Explanation:
Digit 8 is inside of 3 nested parentheses in the string.
 */
public class maxNestedDepthParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {

        /*
        * Valid parethesis,
        * try to try different variations using counter
        * if ')' found max and reduce 1 because one pair is done, we only need max so deduce max first
        */
        int max = 0; // if i/p is "A" -> max should be 0 (VVI)
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }else if (s.charAt(i) == ')') {
                max = Math.max(max,count);
                --count;
            }
        }
        return max;

        // Using Stack
//        Stack<Character> st = new Stack<>();
//        int max = 0;
//        for (int i=0; i<s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                st.push('(');
//
//            }else if (s.charAt(i) == ')') {
//                if (st.size() > max) {
//                    max = st.size();
//                }
//                st.pop();
//
//            }
//        }
//        return max;

    }


}
