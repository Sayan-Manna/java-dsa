package SlidingWindow;
import java.util.Arrays;
// Leetcode - 239
// Maximum of all sub-arrays of size k
public class slidingWinMaximum {
    private static void findMax(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int[] ans = new int[arr.length-k+1];
        // Sliding Window
//        int i=0, j=0;
//        while (j < arr.length) {
//            max = Math.max(max, arr[j]);
//            System.out.println(max);
//            if (j-i+1 == k) {
//                max = Math.max(max, arr[j]);
//                ans[i++] = max;
//            }
//            j++;
//        }

        // Brute-force
        for (int i=0; i<arr.length-k+1; i++) {

            for (int j=i; j<i+k; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
//        int[] arr = {1,-1};
//        int k=1;
        findMax(arr, k);
    }
}
