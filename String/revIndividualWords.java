package String;

import java.util.Stack;

// I/P: "Hello World"
// O/P: olleH dlroW
public class revIndividualWords {
    private static void revWords(String s) {
        // Using Stack
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != ' ') {
                st.push(s.charAt(i));
            }else{
                // if space encountered, then print
                while (!st.empty()) {
                    System.out.print(st.pop());
                }
                // To add space after every word
                System.out.print(" ");
            }
        }
        // As there should not be space after last word
        while (!st.empty()) {
            System.out.print(st.pop());
        }

        // Using in-built
//        String[] words = s.split("\\s+");
//        for (String word : words) {
//            System.out.print(new StringBuilder(word).reverse()+" ");
//        }

    }

    public static void main(String[] args) {
        String s = "DSA is tough";
        revWords(s);
    }
}
