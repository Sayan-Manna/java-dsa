package String.Basics;

/*
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
 */

public class largestOddNumString {
    public static void main(String[] args) {
        String num = "35427";

        // Optimal :: O(N)
        // Find the largest suffix ending with an odd digit
        // logic :: we want the largest odd -> so check from right to left if last digit is odd that means whole part is odd, and we need largest so whole is the ans
        /*
        In Java, characters are internally stored as ASCII values (or Unicode code points). The digits '0' to '9' have consecutive ASCII values:
            •	'0' → 48
            •	'1' → 49
            •	'2' → 50
            •	'3' → 51
            •	…
            •	'9' → 57

        Since these values are sequential, subtracting '0' (which is 48) from any digit character gives its actual integer value.
        char c = '7';
        int num = c - '0'; // (55 - 48) = 7
        System.out.println(num); // Output: 7
         */


        boolean isOdd = false;
        for (int i=num.length()-1; i>=0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                isOdd = true;
                System.out.println(num.substring(0, i+1));
                break;
            }
        }
        System.out.println("");



        // Brute-force - overflow occurs in parseInt or parseLong - O(n^3) as inside substring() and parse both takes N time
        /*
        * 2 loops to get all the substrings
        * Get one substring -> convert to int or long -> check if odd -> if yes, compare with max
        * Get a flag to check if any odd number is found -> if flag is false return "" else the max odd
         */

    }
}
