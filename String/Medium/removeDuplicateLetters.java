package String.Medium;

import java.util.Arrays;

// Leetcode - 316, 1081
//remove duplicate letters so that every letter appears once and only once.
// You must make sure your result is the smallest in lexicographical order among all possible results.
// or-----
// return the lexicographically smallest subsequence of s that contains
// all the distinct characters of s exactly once.
//Input: s = "cbacdcbc"
//Output: "acdb"
public class removeDuplicateLetters {
    public static void main(String[] args) {
        String s = "cbacdcbc"; //cbad -> a
        int[] lastIndex = new int[26];
        for (int i=0;i<s.length();i++) {
            lastIndex[s.charAt(i)-'a'] = i;// [2 , 3, 4,
        }
        System.out.println(Arrays.toString(lastIndex));

    }
}
