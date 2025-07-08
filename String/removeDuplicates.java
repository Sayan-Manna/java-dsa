package String;

import java.util.*;

public class removeDuplicates {
    private static String sortInPlace(String str, String oriStr) {
        char[] charArr = str.toCharArray();
        int i=0;
        for (int j=1; j<charArr.length; j++) {
            if (charArr[j] != charArr[i]) {
                i++;
                charArr[i] = charArr[j];
            }
        }

        str = new String(charArr);
        return str.substring(0, i+1);
    }
    private static String removeDuplicateLetters(String str) {
        // Using Boolean Array : Keeps original order

        // Using indexOf() : Keeps original order
//        String ans = new String();
//        for (int i=0; i<str.length(); i++) {
//            // get the i-th character
//            char c = str.charAt(i);
//            // find the index of the same i-th char, from index i+1, in the string and store it
//            int index = str.indexOf(c, i+1);
//
//            // if the index is not found, that means, there is no duplicate
//            // so add it with the ans string
//            if (index < 0) {
//                ans += c;
//            }
//        }
//        return ans;
        //-----------------------------------------------
        // Using HashMap : Keeps original order
//        Map<Character, Integer> map = new HashMap<>();
//        String ans="";
//        for (int i=0; i<str.length(); i++) {
//            if (!map.containsKey(str.charAt(i))) {
//                ans += str.charAt(i);
//                map.put(str.charAt(i), 1);
//            }
//        }
//        return ans;
        // ---------------
        // Using SET : doesn't keep original order
//        Set<Character> set = new HashSet<>();
//        for (int i=0; i<str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//        return set.toString().replaceAll("\\,|\\[|\\]|\\s", "");
        // ---------------
        // Using Sorting: In-Place : doesn't keep original order
//        char[] ch = str.toCharArray();
//        Arrays.sort(ch);
//        return sortInPlace(new String(ch), str);

        // Naive : O(n^2)
        // Traverse the string, also declare a variable 'j' to add the first char in result
        String s = "";
//        for (int i = 0; i < str.length(); i++) {
//            int j=0; // Store the index of the 1st char, to print it
//            for (j = 0; j < i; j++) { // Traverse 'j' from 0 to i
//                if (str.charAt(i) == str.charAt(j)) { // if both chars are equal, then break
//                    break;
//                }
//            }
//            if (i == j) { // if 'i' and 'j' are in same position
//                s += str.charAt(i);
//            }
//        }
        for (int i=0; i<str.length()-1; i++) {
            int j = 0;
            for (int k=i+1; k<str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    if (!s.contains(String.valueOf(str.charAt(i))))
                        s += str.charAt(i);
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("After removing duplicates: "+ removeDuplicateLetters(str));

    }
}
