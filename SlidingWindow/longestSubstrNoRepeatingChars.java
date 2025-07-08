package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Longest Substring with no repeating characters
/*
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


*/
public class longestSubstrNoRepeatingChars {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        // Optimal -------------TC
        int left = 0, right = 0, maxLen = 0; // maxLen is 0 because if the string is empty, then the length is 0
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            // calculations
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;



        // Using Map --------------||
//            char ch = s.charAt(right);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//
//            while (map.get(ch) > 1) {
//                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
//                left++;
//            }
//            maxLen = Math.max(maxLen, right - left + 1);
//            right++;

        }
        return maxLen;


        // Better --------------TC: O(N^2) | O(N)
        /*
        - generate all substrings
        - check if the substring has all unique characters using a set inside the loop
        - if yes, then update the max length
        - all basic set operations are O(1) in avg case
        - inner loop breaks if the character is already present in the set - in wc O(N)
         */

        // Brute-force ----------TC: O(N^3) | O(N)
        /*
        - Generate all substrings of the given string
        - now isUnique() function to check if the substring has all unique characters
        - if yes, then update the max length
        - if no, then continue
        - return the max length
        - For uniqueness check, we can use a set.contains() method
         */


    }

}
