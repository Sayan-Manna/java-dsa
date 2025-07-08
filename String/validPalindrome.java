package String;
// leetcode -
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
public class validPalindrome {
    private static boolean isValidPalindrome(String s) {
        // W/O REGEX - 2 pointer
        // Use the technique i == n - i -1 in 2 pointer
        int start = 0, end = s.length()-1;
        // single element is also palindrome so = used
        while (start <= end) {
            // if start at non letter or digit
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // if end at non letter or digit
            // else is necessary as we want to omit all possible non letter/digits
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;

        // With REGEX
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
//                return false;
//            }
//        }
//        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }
}
