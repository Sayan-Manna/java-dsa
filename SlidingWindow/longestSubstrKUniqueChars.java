package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Longest Substring With K Unique Characters
// Basically there will be substrings but with K unique characters, find the longest one
/*
Input: Str = “aabbcc”, k = 2
Output: 4
Explanation: Max substring can be any one from [“aabb” , “bbcc”].

Input: Str = “aabbcc”, k = 3
Output: 6
Explanation: There are substrings with exactly 3 unique characters
                        [“aabbcc” , “abbcc” , “aabbc” , “abbc” ]
                        Max is “aabbcc” with length 6.

Input: Str = “aaabbb”, k = 3
Output: -1
Explanation: There are only two unique characters, thus show error message.

*/
public class longestSubstrKUniqueChars {
    public static void main(String[] args) {
       String s = "aabbcc";
       int k = 3;
        System.out.println(longestSubstrWithKUniqueChars(s, k));
    }

    private static int longestSubstrWithKUniqueChars(String s, int k) {
        // Optimal
        // For unique characters, we can use a Hashmap + rest we can use sliding window to get the longest substring
        int start = 0, end = 0, max = -1;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            // calculations
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // shrink window
            while (start <= end && map.size() > k) {
                char left = s.charAt(start);
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                start++;
            }

            if (map.size() == k) {
                max = Math.max(max, end-start+1);
            }
            end++;
        }
        return max;


        // Better :: O(N^2) | O(N) -------------
        /*
        - Can't minimize N^2 so countUniqueChars must be optimized
        - Instead of checking unique characters for each substring separately, we maintain a frequency array.
        - map has property kry - value, once key is 2 unique we'll take max, we don't care about value and other cases
         */
//        int max = -1;
//        for (int i=0; i<s.length(); i++) {
//            Map<Character, Integer> map = new HashMap<>();
//            for (int j=i; j<s.length(); j++) {
//                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
//                if (map.size() == k) {
//                    max = Math.max(max, j-i+1);
//                }
//            }
//        }
        // using a freq array - only lower case, for upper + lower (52) + for ascii (128) + for unicode (256)
        // O(N^2) | O(1)
//        int max = -1;
//
//        for (int i=0; i<s.length(); i++) {
//            int[] freq = new int[26];
//            int unique = 0;
//            for (int j=i; j<s.length(); j++) {
//                char ch = s.charAt(j);
//                if (freq[ch - 'a'] == 0) {
//                    unique++;
//                }
//                freq[ch - 'a']++;
//                if (unique == k) {
//                    max = Math.max(max, j-i+1);
//                }
//            }
//        }
//        return max;

        // Brute-force | O(N^3) in WC | O(N) WC ---------------
        /*
        -> We can generate all the substrings and check if they have K unique characters
        -> If they have K unique characters, then we can check which is the longest
        */
//        int max = -1;
//        for (int i=0; i<s.length(); i++) {
//            for (int j=i; j<s.length(); j++) {
//                if (countUniqueChars(s, i, j) == k) {
//                    max = Math.max(max, j-i+1);
//                }
//            }
//        }
    }
    private static int countUniqueChars(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i=start; i<=end; i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
