package String.Medium;

public class longestPalindromicSubstr {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {

        // Optimal
//        for (int i=0; i<s.length(); i++) {
//            for (int j=i; j<=s.length(); j++) {
//                char ch = s.charAt(j);
//                if (isPalindrome(sub)) {
//                    return sub;
//                }
//            }
//        }
        return "dummy";
        // Brute force approach  O(N^3)
        // Take out substrings and check if they are palindrome



    }

}
