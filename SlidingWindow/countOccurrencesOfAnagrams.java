package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// LC- 438 Similar Problem
/*
Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.
Input: txt = "forxxorfxdofr", pat = "for"
Output: 4
Explanation: for, orf and ofr appears in the txt, hence answer is 4.

Input: txt = "aabaabaa", pat = "aaba"
Output: 5
Explanation: aaba is present 5 times in txt.

Basically all possible anagrams of the word pat should be counted in the text txt.
*/
public class countOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String txt = "aabaabbabbabaa";
        String pat = "aaba";
        System.out.println(countAnagrams(txt, pat));
    }

    private static int countAnagrams(String txt, String pat) {

        // Sliding Window -----------------|
//        Map<Character, Integer> map = new java.util.HashMap<>();
//        int k = pat.length();
//        List<Integer> ans = new ArrayList<>();
//        // Store the frequency of each character in the pattern
//        for (char c : pat.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        int count = map.size(); // Number of keys
//        int i = 0, j = 0;
//        while (j < txt.length()) {
//            // calculation -> update count
//            char ch = txt.charAt(j);
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) - 1);
//                if (map.get(ch) == 0) count--;
//            }
//
//            if (j-i+1 < k) j++;
//            else if (j-i+1 == k) {
//                if (count == 0) {
//                    ans.add(i);
//                }
//                if (map.containsKey(txt.charAt(i))) {
//                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
//                    if (map.get(txt.charAt(i)) == 1) count++;
//                }
//                i++;
//                j++;
//            }
//        }
//        return ans.size();
        // Better - FrequencyMap | O(N*M) | O(N) ---------|
        int m = pat.length();
        int n = txt.length();
        if (m > n) return 0;

        int[] patFreq = new int[26];
        // Store the frequency of each character in the pattern
        for (char c : pat.toCharArray()) {
            patFreq[c - 'a']++;
        }
        int count = 0;
        for (int i=0; i<n-m-1; i++) {
            String sub = txt.substring(i, i+m);
            int[] subFreq = new int[26];
            for (char c : sub.toCharArray()) {
                subFreq[c - 'a']++;
            }
            if (Arrays.equals(patFreq, subFreq)) {
                count++;
            }
        }
        return count;



        // Brute-force | O(N! * M) | O(N!) ---------|
        /*
        * Generate all substrings of length m from pat
        *


         */

    }

}
