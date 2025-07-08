package String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

 */
public class sortCharsByFreq {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sortByFreq(s));
    }

    private static String sortByFreq(String s) {
        // Optimal (Using Heap)

        //  Better ----------------- O(n + k log k) | O(n+k)
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        // Sort characters by frequency in descending order
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            int freq = map.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        return sb.toString();

        //  Brute-force ---- O(n*k) k=no of unique characters
        /*
        * almost similar to better but we get the max freq from map
        * Now freq=maxFreq till 1
            * Traverse map and check if entry.getValue() == freq
                * append entry.getKey() to sb using loop for freq times
         */
    }
}
