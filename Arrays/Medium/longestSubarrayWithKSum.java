package Arrays.Medium;
// Leetcode - 325
import java.util.HashMap;
import java.util.Map;

//Input:
//arr = {7,1,6,0}, k = 7
//Output: Length of the longest subarray with sum K is 3
//Explanation: 1 + 6 + 0 = 7, it is the longest subarray with sum 7 and length 3.
public class longestSubarrayWithKSum {
    private static void subArrSumK(int[] arr, int k) {
        // Hashing using prefix sum
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0, -1);
//        int sum = 0;
//        int maxLen = 0;
//        for (int i=0; i<arr.length; i++) {
//            sum += arr[i];
//            // In case of 0 or sum-k=0, but we are putting sum as 0, and it's index -1 already in the map
//            // So we don't need to check this condition
//            // bottom if condition will handle the situation
////            if(sum == k) {
//////                maxLen = i+1;
////                maxLen++;
////            }
//            if (map.containsKey(sum-k)) {
//                maxLen = Math.max(maxLen, i-map.get(sum-k)); // ending index=i
//            }
//            // Only add the (sum : index) in map, when
//            // the SUM is not present in the map already
//            // this condition prevents duplicates => in case of {0,0,0} or something like this
//            if (!map.containsKey(sum)) {
//                map.put(sum, i);
//            }
//        }
//        System.out.println(maxLen);

        // Sliding window (+ve only)
        int i=0, j=0;
        int sum = 0;
        int maxLen = -1;
        while (j < arr.length) {
            sum += arr[j]; // Expand window by adding right element

            // Shrink window if sum exceeds K
            while ( i <= j && sum > k) {
                sum -= arr[i];
                i++;
            }

            // If sum becomes exactly K, update maxLen
            if (sum == k) {
                int length = j-i+1;
                maxLen = Math.max(maxLen, length);
            }
            j++;
        }
        System.out.println(maxLen);


        // Naive : O(n^2)
//        int len = 0;
//        int max = Integer.MIN_VALUE;
//        for (int i=0; i<arr.length; i++) {
//            int sum = 0;
//            for (int j=i; j<arr.length; j++) {
//                sum += arr[j];
//                if (sum == k) {
//                    len++;
//                    if (len > max) {
//                        max = len;
//                    }
//                }
//            }
//        }
//        System.out.println(max);
    }

    public static void main(String[] args) {
//        int[] arr = {3,4,-7,1,3,3};
        int[] arr = {7,1,6,0};
        subArrSumK(arr, 7);
    }
}
