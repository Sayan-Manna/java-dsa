package Arrays;

import java.util.HashMap;
import java.util.Map;
/*
* Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j]
* and abs(i - j) <= k
 */
//Leetcode-219
public class containsDuplicate2 {
    static boolean Solve(int[] arr, int k) {
        // Using Sliding Window

        // Using Map - O(n) | O(n)
        // NOTE: The map.put(key, value) method in Java’s HashMap does two things:
        // --------------------
        //	1.	Inserts or updates the key-value pair in the map.
        //	2.	Returns:
        //	•	If the key was already present, it returns the previous value associated with the key.
        //	•	If the key was not present, it returns null.
//        Map<Integer,Integer> map = new HashMap<>();
//        if (k == 0) return false; // if k=0, it is impossible to have two indices i and j such that abs(i - j) <= k, because i - j would always be greater than or equal to 1. So, returning false immediately is valid
//        for (int i=0; i<arr.length; i++) {
//            Integer prevData = map.put(arr[i],i);
//            if (prevData != null && i - prevData <= k) {
//                return true;
//            }
//        }
//        return false;


        // Using Map (without map.put() return type) - O(n) | O(n)
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prevIndex = map.get(arr[i]);

                if (i - prevIndex <= k) {
                    return true;
                }
            }
            // Update the current index of this element in the map
            map.put(arr[i], i);
        }
        return false;

        // Brute-force - O(n^2) | O(1)
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j] && Math.abs(i - j) <= k) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        System.out.println(Solve(arr, k));
    }
}
