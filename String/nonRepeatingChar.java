package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Input: string = “yahoo”
//Output: y,a,h
//Explanation: Non repeating characters are y,a,h
public class nonRepeatingChar {
    public static void main(String[] args) {
        String s = "yahoo";
        // Using Freq[]
        int[] freq = new int[256];
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }else{
                // Increment each char's frequency
                freq[s.charAt(i)]++;
            }
        }
        // To maintain order
        for (int i=0; i<s.length(); i++) {
            if (freq[s.charAt(i)] == 1 && s.charAt(i) != ' ') {
                System.out.print((char) ((int)s.charAt(i))+" ");
            }
        }
//        // This is distort the order
//        for (int i=0; i< freq.length; i++) {
//            if (freq[i] == 1) {
//                System.out.print((char) i + " ");
//            }
//        }
//        // Using HashMap
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i=0; i<s.length(); i++) {
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//        map.forEach((k,v) -> {
//            if (v == 1) {
//                System.out.print(k+" ");
//            }
//        });
//        // Naive : O(N^2)
//        s = s.toLowerCase().strip().replaceAll(" ", "");
//        for (int i=0; i<s.length()-1; i++) {
//            boolean isDuplicate = false;  // Flag to track if duplicate is found
//            for (int j=i+1; j<s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                System.out.print(s.charAt(i)+" ");
//            }
//        }
    }
}
