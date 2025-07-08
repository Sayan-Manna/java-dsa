package Arrays;
import java.util.*;

// LC- 532
//Input: nums = [3,1,4,1,5], k = 2
//Output: 2
//Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
//Although we have two 1s in the input, we should only return the number of *unique pairs*.
public class kDiffPairs {
    private static int findPair(int[] arr, int k) {
        // Sorting + Binary Search
        // 2-pointer + sort (O(nlogn)
//        if (k < 0) return 0; // No valid pairs if k is negative
//
//        Arrays.sort(arr); // Sorting the array: O(n log n)
//        int left = 0, right = 1, count = 0;
//
//        while (right < arr.length) {
//            int diff = arr[right] - arr[left];
//
//            if (diff == k) {
//                count++;
//                left++;
//                right++;
//
//                // Skip duplicates for both pointers
//                while (left < arr.length && arr[left] == arr[left - 1]) left++;
//                while (right < arr.length && arr[right] == arr[right - 1]) right++;
//            } else if (diff < k) {
//                right++; // Increase the difference
//            } else {
//                left++; // Decrease the difference
//            }
//
//            // Ensure pointers do not overlap
//            if (left == right) right++;
//        }
//
//        return count;
        // other way -------------
//        if (k < 0) return 0; // No valid pairs for negative k
//
//        Arrays.sort(arr); // Sort the array
//        int count = 0;
//        int i = 0, j = 1;
//
//        while (i < arr.length && j < arr.length) {
//            if (i == j || arr[j] - arr[i] < k) {
//                // Move j forward if the difference is too small or i == j
//                j++;
//            } else if (arr[j] - arr[i] > k) {
//                // Move i forward if the difference is too large
//                i++;
//            } else {
//                // Valid pair found
//                count++;
//                i++;
//                j++;
//                // Skip duplicates
//                while (j < arr.length && arr[j] == arr[j - 1]) j++;
//            }
//        }
//        return count;

        // 2 - HashSet
        // HashMap - 1 Pass
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            // only run if duplicate present
            if (map.containsKey(i)) {
                // now if duplicate=>T and k=0 then if runs
                // Now we want unique pairs, and there might be multiple no. of duplicates
                // hence the condition && map.get(i)==1
                if (k==0 && map.get(i) == 1) {
                    // (i,2)
                    map.put(i, map.get(i)+1);
                    count++;
                    System.out.println("("+i+","+i+")");
                }
            }else{
                if (map.containsKey(i+k)) {
                    count++;
                    System.out.println("("+i+","+Math.abs(k+i)+")");
                }
                if (map.containsKey(i-k)) {
                    count++;
                    System.out.println("("+Math.abs(i-k)+","+i+")");
                }
                map.put(i, 1);
            }
        }
        return count;

        // HashMap - 2 passes
//        int count=0;
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i: arr) map.put(i, map.getOrDefault(i,0)+1);
//        for (int i : map.keySet()) {
//            if (k>0 && map.containsKey(i+k) || k==0 && map.get(i)>1) {
//                System.out.println("("+i+","+Math.abs(i+k)+")");
//                count++;
//            }
//        }
//        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,1,1,4};
        int[] arr1 = new int[]{1,2,3,4,5};
        int k = 0;
        int k1=1;
        System.out.println(findPair(arr, k));
    }
}
