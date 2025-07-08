package String.Medium;
/*
The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"],
each with beauty equal to 1.

Input: s = "aabcbaa"
Output: 17
 */

import java.util.HashMap;
import java.util.Map;

public class sumOfBeauty {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(sumOfBeautySubstr(s));

    }

    private static int sumOfBeautySubstr(String s) {

        // Optimal | O(n^2) | O(1)
        /*
        * efficient sub-string generation
        * 26 size freq array to store the frequency of each character
        * traverse the array and calculate the max and min frequency for each substring and add the difference to the count
         */
        int count=0;
        for (int i=0; i<s.length(); i++) {
            int[] freq = new int[26];
            for (int j=i; j<s.length(); j++) {
                // get the character
                char ch = s.charAt(j);
                // in the freq array, we are storing the frequency of each character
                freq[ch-'a']++;
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;
                for (int k=0; k<26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }
                count += maxFreq - minFreq;
            }
        }
        return count;

        // Brute force  => O(n^3) | O(N)
//        int count=0;
//        for (int i=0; i<s.length(); i++) {
//            for (int j=i+1; j<=s.length(); j++) {
//                String substr = s.substring(i,j);
//                int maxFreq = calcMaxFreq(substr);
//                int minFreq = calcMinFreq(substr);
//                if ((maxFreq - minFreq) > 0) {
//                    count++;
//                }
//            }
//        }
//        return count;
    }

    private static int calcMinFreq(String substr) {
        // wc k can be n
        Map<Character, Integer> map = new HashMap<>();
        for (char c: substr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        // w/o java 8
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            min = Math.min(min, entry.getValue());
        }
        return min;
    }
    private static int calcMaxFreq(String substr) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: substr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        // w/o java 8
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }
}
