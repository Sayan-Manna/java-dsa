package StackAndQueue;

public class ValidParentheses {
    private static boolean isValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i) =='(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }else {
                if (st.isEmpty()) return false;

                char ch = st.peek();
                st.pop();

                if (s.charAt(i) == ')') {
                    char popped = st.pop();
                    if (popped != '(') {
                        break;
                    }
                }
                if (s.charAt(i) == ']') {
                    char popped = st.pop();
                    if (popped != '[') {
                        break;
                    }
                }
                if (s.charAt(i) == '}') {
                    char popped = st.pop();
                    if (popped != '{') {
                        break;
                    }
                }
            }
        }
        return (st.isEmpty()) ? true:false;
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValidParentheses(s));

    }
}
