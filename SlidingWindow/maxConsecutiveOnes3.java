package SlidingWindow;

/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.



Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 */

public class maxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    private static int longestOnes(int[] arr, int k) {

        // Optimal -----------------------| O(N)
        // Longest subarray with at most k 0's -> Variable size sliding window
        /*
        - Calc : Don't use a for loop to count zeros
        - condition : zeroCount <= k
        - if > k => if arr[left] == 0 make zeroCount-- and left++ also if 1 left++ => once it goes back to <=k break
         */
        int left = 0, right = 0, zeroCount = 0, max = -1;
        while (right < arr.length) {
            // calc -- Don't use a for loop -> inefficient, if used tae zeroCount = 0, for every new iteration -- otherwise it'll re calculate
                // For example:
                    // - when right is at 3 => previously due to right 2, zeroCount = 1, now right++ so right=3
                    // - Now when right = 3 -> loop re iterates when i at idx=2, zeroCount becomes 2 (because before it was 1 which is wrong) -> Thereby clean it for every re-iteration or don't use/

//            zeroCount = 0;
//            for (int i=left; i<=right; i++) {
//                if (arr[i] == 0) zeroCount++;
//            }
            // efficient calculation
            if (arr[right] == 0) zeroCount++;

            while (zeroCount > k) {
                // remove cal for ans
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;

            }
            if (zeroCount <= k) {
                max = Math.max(max, right-left+1);
            }
            right++;
        }
        return max;




        // Brute force -------| Time complexity : O(n^3) --------|
        // Can I convert this problem to : longest subarray with at most k 0's, K in this case is 2 (VVI)
        /*
        - Generate all possible subarrays
        - traverse each subarray and count the number of 0's
        - if the number of 0's is less than or equal to k, then update the max
         */
//        int max = 0;
//        for (int i=0; i<arr.length; i++) {
//            for (int j=i; j<arr.length; j++) {
//                int count = 0;
//                for (int l=i; l<= j; l++) {
//                    if (arr[l] == 0) {
//                        count++;
//                    }
//                }
//                if (count <= k) {
//                    max = Math.max(max, j-i+1);
//                }
//            }
//        }
//        return max;
    }

}
