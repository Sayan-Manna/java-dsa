package String.Medium;
// Check if all the palindromic sub-strings are of odd length
// https://www.geeksforgeeks.org/check-if-all-the-palindromic-sub-strings-are-of-odd-length/
//Input: str = “geeksforgeeks”
//Output: NO
//Since, “ee” is a palindromic sub-string of even length.
public class checkIfAllPalSubstrOddLen {
    static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    private static boolean CheckOdd(String s) {
        // Efficient : O(n) | O(1)

        // O(n^3) | O(n)
        for (int i=0; i<s.length(); i++) {
            String sub = "";
            for (int j=i; j<s.length();j++) {
                sub += s.charAt(j);
                if (sub.length() % 2 == 0 && checkPalindrome(sub)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        if(CheckOdd(s))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
