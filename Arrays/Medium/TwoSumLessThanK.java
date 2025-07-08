package Arrays.Medium;

/*
Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum
and sum < k. If no i, j exist satisfying this equation, return -1.

Input: nums = [34,23,1,24,75,33,54,8], k = 60
Output: 58
Explanation: We can use 34 and 24 to sum 58 which is less than 60.
---
Input: nums = [10,20,30], k = 15
Output: -1
Explanation: In this case it is not possible to get a pair sum less that 15.
*/

import java.util.Arrays;

public class TwoSumLessThanK {
    public static void main(String[] args) {
        int[] arr = {34,23,1,24,75,33,54,8};
        int k =60;
        Solution(arr, k);
    }

    private static void Solution(int[] arr, int target) {

        int maxSum = -1;
        // Sorting + BS
        // 2 pointer + Sorting :: O(nlogn + n) | O(1)
        Arrays.sort(arr);
        int low = 0, high=arr.length-1;
        while (low < high) {
            int sum = arr[low]+arr[high];
            if (sum < target) {
                maxSum = Math.max(maxSum, sum);
                low++;
            }
            else high--;
        }

       // Brute-force :: O(n^2)
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                int sum = arr[i]+arr[j];
//                // If the sum is less than k and greater than the current maxSum
//                if (sum < target && sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
        System.out.println(maxSum);
    }
}
