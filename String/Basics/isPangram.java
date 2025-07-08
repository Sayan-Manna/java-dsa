package String.Basics;

import java.util.Arrays;

// A string is a pangram string if it contains all the character of the alphabets ignoring the case of the alphabets.
// Input: str = “GeeksForGeeks”
//Output: No
//Explanation: The given string does not contain all the letters from a to z (ignoring case).
public class isPangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog".toLowerCase();
        // O(N) | O(26)
        boolean[] present = new boolean[26];
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i)>='a' && s.charAt(i) <= 'z') {
                // Mark the presence of the letter in the array
                present[s.charAt(i)-'a'] = true; // current letter => s.charAt(i)-'a' is integer
            }
            // or
//            if (s.charAt(i) != ' ') {
//                present[s.charAt(i) - 'a'] = true;
//            }
        }
        // check if all are present in array
        for (boolean isPresent : present ) {
            if (!isPresent) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
