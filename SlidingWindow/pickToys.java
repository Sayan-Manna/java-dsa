package SlidingWindow;
// Similar to Longest Substring with K uniqie chars
/*
s = "abaccab", k=2 (max type of toys permitted) -> Now at most K, basically of if K is 2, 2 and 1 are permitted
o.p: 4 (acca)

 */

import java.util.HashMap;
import java.util.Map;

public class pickToys {
    public static void main(String[] args) {
        String s = "aaaaa"; // every letter is a type of toy
        System.out.println(pickToys(s, 2));
    }
    private static int pickToys(String typeOfToys, int maxType) {
        int left = 0, right = 0, max = 0;
        int n = typeOfToys.length();
        Map<Character, Integer> map = new HashMap<>();
        while (right < n) {
            // calc
            char ch = typeOfToys.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) +1);

            while (map.size() > maxType) {
               map.put(typeOfToys.charAt(left), map.get(typeOfToys.charAt(left))-1);
               if (map.get(typeOfToys.charAt(left)) == 0) {
                   map.remove(typeOfToys.charAt(left));
               }
               left++;
            }
            if (map.size() <= maxType) max = Math.max(right-left+1, max);
            right++;
        }
        return max;
    }
}
