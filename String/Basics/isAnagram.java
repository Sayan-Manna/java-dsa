package String.Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// An anagram of a string is another string that contains the same characters,
// only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other
// Input: str1 = “listen”  str2 = “silent”
// Output: “Anagram”
// Explanation: All characters of “listen” and “silent” are the same.
//Input: str1 = “gram”  str2 = “arm”
//Output: “Not Anagram”
public class isAnagram {
    private static int CHARACTER_RANGE= 256;
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) return false;
        // Using count[] => O(n) | O(256)/O(1)
        int[] count = new int[CHARACTER_RANGE]; // With extended ASCII codes, there are a total 256 characters

        for (int i=0;i<str1.length();i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++)
            if (count[i] != 0) return false;
        return true;

        // or Hashing => O(n)+O(N) | Space: O(N)
//        if (str1.length() != str2.length()) return false;
//        Map<Character, Integer> map = new HashMap<>();
//        // O(N), map.put() has avg TC of O(1), assuming there are no collisions
//        for (int i=0; i<str1.length(); i++) {
//            map.put(str1.charAt(i), i);
//        }
//        // O(N), .containsKey() has avg TC O(1)
//        for (int i=0; i<str2.length();i++) {
//            if (!map.containsKey(str2.charAt(i))) {
//                return false;
//            }
//        }
//        return true;

//        // or O(n)+O(n)+O(nlogn)+O(nlogn)
//        if (str1.length() != str2.length()) return false;
//        char[] charArr1 = str1.toCharArray();
//        char[] charArr2 = str2.toCharArray();
//        Arrays.sort(charArr1);
//        Arrays.sort(charArr2);
//        return Arrays.equals(charArr1, charArr2);

        // or O(N * N ) => M/N = length of str2, N=length of str1 => contains take O(N) time for each M/N in str2
//        if (str1.length() != str2.length()) return false;
//        for (char c : str2.toCharArray()) {
//            if (!str1.contains(String.valueOf(c))) {
//                return false;
//            }
//        }
//        return true;

    }
    public static void main(String[] args) {
        String str1 = "ra   m";
        String str2 = "m   a  r";
        boolean areAnagrams = areAnagrams(str1, str2);
        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
