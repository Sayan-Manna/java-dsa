package Arrays;
//nums = [8, 7, 2, 5, 3, 1]
//target = 10
//Output:
//Pair found (8, 2)
//Pair found (7, 3)
import java.util.*;

public class pairWithGivenSum {
    static void pairSum(int[] arr, int target) {
        // Native Approach: O(n^2)
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                if (arr[j] + arr[i] == target) {
//                    System.out.println("("+ arr[i] + ", " + arr[j] + ")");
//                }
//            }
//        }

        // Using Sorting
//        1. Arrays.sort(arr)
//        2. low=0, high = n-1;
//        3. do binary search

        // Using Hashing
        // 1.
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.printf("Pair found (%d, %d)", arr[map.get(complement)], arr[i]);
                System.out.println();
            }
            map.put(arr[i], i);

        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1}; // -1, 1, 5, 7
        int target = 6;
        pairSum(arr, target);
    }
}
