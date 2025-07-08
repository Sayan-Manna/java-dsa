package SlidingWindow;
/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
The testcases will be generated such that the answer is unique.


Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
*/

import java.util.HashMap;
import java.util.Map;

public class minimumWindowSubstr {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    private static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "-1";

        // Optimal -------| O(N) | O(M) ---------|
        // We can store the startIdx also then later do the substring operation -> optimization
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, startIdx = -1;
        String ans = "";
        Map<Character, Integer> map = new HashMap<>();
        // freq map for t
        for(int k=0;k<t.length();k++) {
            char c=t.charAt(k);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = map.size();
        while (right < s.length()) {
            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
//                    ans = s.substring(left, right + 1);
                    startIdx = left;
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) count++;
                }
                left++;
            }
            right++;
        }
//        return ans;
        return minLen == Integer.MAX_VALUE ? ans : s.substring(startIdx, startIdx + minLen);


        // Better

        // Brute-force -------|

    }

}
