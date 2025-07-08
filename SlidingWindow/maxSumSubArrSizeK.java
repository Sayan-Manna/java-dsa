package SlidingWindow;
// maximum sum sub-array of size k
// [2,5,1,8,2,9,1], k=3
// o/p: 19 [8,2,9]
// This problem without the window size is the maximum sum sub-array (Kadane's Algo)
public class maxSumSubArrSizeK {
    private static void Solution(int[] arr, int k) {
        // Sliding Window - fixed size - O(n) | O(1)
        int start = 0, end = 0;
        int sum=0, maxSum = Integer.MIN_VALUE;
        while (end < arr.length) {
            // prefix sum until window size becomes k
            sum += arr[end];
            // increase end so that window size becomes k
            // Once k, find the max
            // Then remove 1st element and increase one size in window
            if (end-start+1 < k) {
                end++;
            }else if (end-start+1 == k) {
                maxSum = Math.max(maxSum, sum);
                // as 1st box is removed, the num of 1st box will also be removed
                sum = sum - arr[start];
                // slide the window
                start++;
                end++;
            }
        }
        System.out.println(maxSum);
        // Queue O(n) | O(k)
        // Naive - O(n^2) :: remember j < i+k and i < n-k+1
//        int max = Integer.MIN_VALUE;
//        for (int i=0; i<arr.length-k+1; i++) {
//            int sum = 0;
//            for (int j=i; j<i+k; j++) {
//                sum += arr[j];
//            }
//            max = Math.max(max, sum);
//        }
//        System.out.println(max);

    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1};
        int k = 3;
        Solution(arr,k);
    }
}
