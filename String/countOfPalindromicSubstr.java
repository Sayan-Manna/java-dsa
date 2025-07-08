package String;

import java.util.*;

// Find the count of palindromic sub-string of a string in its sorted form
//https://www.geeksforgeeks.org/find-the-count-of-palindromic-sub-string-of-a-string-in-its-sorted-form/
/*
Input: str = “acbbd”
Output: 6
All palindromic sub-string in it’s sorted form (“abbcd”) are “a”, “b”, “b”, “bb”, “c” and “d”.
 */
public class countOfPalindromicSubstr {
    final static int MAX_CHAR = 26;
    static int countPalindrome(String str) {

        int n = str.length();
        int sum = 0;
        // Using Freq array -------- Fails for unsorted string like cec, racecar, aceca
//        // calculate frequency
//        int hashTable[] = new int[MAX_CHAR];
//        // calculate frequency of of chars in string from a-z or 0-25
//        for (int i = 0; i < n; i++) {
//            hashTable[str.charAt(i) - 'a']++;
//        }
//        System.out.println(Arrays.toString(hashTable));
//        // calculate count of palindromic sub-string
//        for (int i = 0; i < 26; i++) {
//            if (hashTable[i] != 0) {
//                sum += (hashTable[i] * (hashTable[i] + 1) / 2); //1+3+1+1
//            }
//        }
//        return sum;

        // Using Hashing ------- Fails for unsorted string like cec, racecar, aceca,abba
        Map<Character, Integer> map = new HashMap<>();
        // Calculate frequency of each character
        for (char c: str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map.toString());
        // Calculate count of palindromic substrings : map.values => [val1, val2, ...]
        for (int count : map.values()) {
            sum += (count * (count + 1)) / 2;
        }

        return sum;


//        // Brute-force --------
//        List<String> list = new ArrayList<>();
//        for (int i=0; i<n; i++) {
//            for (int j=i; j<n; j++) {
//                String sub = str.substring(i, j+1);
//                if (isPalindrome(sub)) {
//                    sum++;
//                    list.add(sub);
//                }
//            }
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        return sum;
    }

    private static boolean isPalindrome(String sub)  {
        for (int i=0; i<sub.length()/2; i++) {
            if (sub.charAt(i) != sub.charAt(sub.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String str = "ananananddd";
        String str = "babad";
        System.out.println(countPalindrome(str));
    }
}
