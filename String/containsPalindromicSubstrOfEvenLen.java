package String;
// Check if a string contains a palindromic sub-string of even length
// We need to find if there exists at least one palindromic sub-string whose length is even.
// https://www.geeksforgeeks.org/check-if-a-string-contains-a-palindromic-sub-string-of-even-length/
//Input  : aassss
//Output : YES
//Input  : gfg
//Output : NO
public class containsPalindromicSubstrOfEvenLen {
    // Notice that a palindrome of even length must contain two same alphabets in the middle.
    // So we just need to check for this condition.
    // If we find two consecutive same alphabets in the string then we output “YES” otherwise “NO”
    // O(n) | O(1)
    static boolean check(String s) {
        // We don't need to check if the palindrome is even or not as if 2 elements are palindrome our search ends
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) == s.charAt(i + 1))
                return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "aassss";
        if (check(s))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
