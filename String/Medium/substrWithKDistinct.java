package String.Medium;
/*
Given a string s of lowercase alphabets, count all possible substrings (not necessarily distinct)
that have exactly k distinct characters.

Examples :

Input: s = "aba", k = 2
Output: 3
Explanation: The substrings are: "ab", "ba" and "aba".
Input: s = "abaaca", k = 1
Output: 7
Explanation: The substrings are: "a", "b", "a", "aa", "a", "c", "a".


 */
public class substrWithKDistinct {
    public static void main(String[] args) {
        String s = "abaaca";
        int k = 2;
        System.out.println(countOfSubstrings(s, k));
    }

    private static int countOfSubstrings(String s, int k) {
        return 0;

    }
}
