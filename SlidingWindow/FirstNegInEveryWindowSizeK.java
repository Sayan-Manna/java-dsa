package SlidingWindow;
// It is a variation of the problem of Sliding Window Maximum.
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
// First Negative Number in every Window of Size K
// [12,-1,-7,8,-15,30,16,28], k = 3 , 8-3+1 = 6
// o/p: [-1,-1,-7,-15,-15,0]
public class FirstNegInEveryWindowSizeK {
    private static void Solution(int[] arr, int k) {
        // Sliding Window using Deque O(n) in WC ---------------
        /*
        * One list to store the negs when arr[j] < 0 -> don't think about 1st neg, 2nd neg here
        * removing 1st neg from list based on condition - but why we are removing think
        * if no neg in a window -> 0 edge case
         */
        int i = 0, j=0;
        // length will be max n-k+1 => outer loop think like this
        int[] ans = new int[arr.length-k+1];
        ArrayDeque<Integer> list = new ArrayDeque<>();
        while (j < arr.length) {
            if (arr[j] < 0) {
                list.add(arr[j]); // [-1,-7 | [-7,-15, | [-15,
            }
            if (j-i+1 == k) {
                if (list.isEmpty()) {
                    ans[i] = 0;
                }else {
                    ans[i] = list.peekFirst(); //[-1, -1, -7,
                    if (arr[i] == list.peekFirst()) { // 12!=-1, -1 == -1 so remove -1 from list,..
                        list.removeFirst();
                    }
                }
                i++;
            }
            j++;

        }
        System.out.println(Arrays.toString(ans));

        // Sliding Window without Deque O(n*k) in WC ---------------
//        List<Integer> result = new ArrayList<>();
//        int firstNeg = -1;
//        int start = 0, end = 0;
//        while (end < arr.length) {
//            // If firstNegativeIndex is not found or it's out of the window, find a new one
//            if (firstNeg < start) {
//                firstNeg = -1;
//                for (int i = start; i <= end; i++) {
//                    if (arr[i] < 0) {
//                        firstNeg = i;
//                        break;
//                    }
//                }
//            }
//            // Expand window till size k
//            if (end - start + 1 < k) {
//                end++;
//            } else {
//                // If a negative number is found within the window, use it
//                if (firstNeg >= start && firstNeg <= end) {
//                    result.add(arr[firstNeg]);
//                } else {
//                    result.add(0);
//                }
//
//                // Slide the window
//                start++;
//                end++;
//            }
//        }
//        System.out.println(result);


        // Brute-Force ----------------
//        long[] ans = new long[arr.length-k+1];
//        int index = 0;
//        for (int i = 0; i<arr.length-k+1; i++) {
//            for (int j=i; j<i+k; j++) {
//                if (arr[j] < 0) {
//                    ans[index++] = arr[j];
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};

        Solution(arr, 3);
    }
}
