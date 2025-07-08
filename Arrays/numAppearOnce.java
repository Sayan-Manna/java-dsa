package Arrays;
// Leetcode : 136
// Given a non-empty array where every element appears twice except for one.
// Find that single one
import java.util.HashMap;
import java.util.Map;

public class numAppearOnce {
    static int Solution(int[] arr) {
        // Using XOR
        int ans =0;
        for (int i : arr) {
            ans ^= i;
        }// at the end of the loop=> ans  = 0 ^ 2 ^ 1 ^ 2 => 0 ^ 2 ^ 2 ^1 => 0 ^ 0 ^ 1 => 1
        return ans;

        // Using Hashing
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : arr) {
//            map.put(i, map.getOrDefault(i,0)+1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return 0;
        // Brute-force
    }
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        System.out.println(Solution(arr));
    }
}
