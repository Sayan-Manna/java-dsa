package String.Basics;
/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range.
Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.


Input: s = " -042"
Output: -42
Explanation:
Step 1: "   -042" (leading whitespace is read and ignored)
Step 2: "   -042" ('-' is read, so the result should be negative)
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
---
Input: s = "0-1"
Output: 0
Explanation:
Step 1: "0-1" (no characters read because there is no leading whitespace)
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
---
Input: s = "words and 987"
Output: 0
Explanation:
Reading stops at the first non-digit character 'w'.
*/

// talk to muthu, get the creds for bfl env -> brainstorm ->
public class atoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));


    }

    private static int myAtoi(String s) {
        /*
        * Simple problem only thing is how cleanly you can code
        * trim first for leading and trailing spaces
        * now flag for -ve and non -ve -> we need flag as when ans is just starting and has 0 value ans = -ans will be 0 only -> same for +ve also
        * ans is first taken as long as we need to check if it is within the range of int
        * -ve or +ve must be 1st so  when i==0 check and update flag -> continue (don't check further simply i++)
        * Now if char is not digit break
        * if range of [0-9] then find the int digit by ch-'0' and update ans = ans*10 + dig
        * if -ve flag is true then check if -ans < Integer.MIN_VALUE return Integer.MIN_VALUE -> also update the ans as -ans
        * if -ve flag is false then check if ans > Integer.MAX_VALUE return Integer.MAX_VALUE
        * Now if not out of range but -ve flag is true then ans = -ans at last and return and in int

        */
        s = s.trim();
        if (s.length() == 0) return 0;
        boolean isNegative = false;
        long ans = 0;

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            // neg handle
            if (i==0) {
                if (ch == '-') {
                    isNegative = true;
                    continue;
                }else if (ch=='+'){
                    isNegative = false;
                    continue;
                }
            }
            // if not within digits break ---- main fun
            if (ch >='0' && ch <= '9') {
                int dig = ch - '0';
                ans = ans * 10 + dig;

                if (isNegative) {
                    long check = -ans;
                    if (check < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                }
                else {
                    if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                }

            }else {
                break;
            }
        }
        if (isNegative) ans = -ans;
        return (int)ans;

    }
}
