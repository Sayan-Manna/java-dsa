package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
// maximum contiguous subarray sum
//arr = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// Leetcode - 53
public class maxSubarraySum {
    private static int maxSubSum(int[] arr, List<Integer> list) {
        // Kadane's Algorithm
        int start = 0; // to get the index of 1st resultant element
        int curr_sum = arr[0];
        int overall_best_sum = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (curr_sum >= 0){
                curr_sum += arr[i];
            }else{
                curr_sum = arr[i];
                start = i; // start will be starting index of every possible batch we found
            }
            // Update the overall sum
            if (curr_sum > overall_best_sum) {
                list.clear();
                overall_best_sum = curr_sum;
                list.add(start);
                list.add(i);
            }
        }
        return overall_best_sum;

        // ---------------------
        // Sorting can't be done here, if we sort, it'll change the structure
        // of the array, thus wrong sub-arrays will be returned
        //----------------------
        // Naive : O(n^2)
//        int max=Integer.MIN_VALUE;
//        for (int i=0; i<arr.length; i++) {
//            int curr_sum = 0; // it'll store the sum of the i-th index to j-th index
//            for (int j=i; j<arr.length; j++) {
//                curr_sum += arr[j];
//                if (curr_sum > max) {
//                    list.clear();
//                    max = curr_sum;
//                    list.add(i);
//                    list.add(j);
//                }
//            }
//        }
//        return max;
    }

    public static void main(String[] args) {
//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr = {-4,-3,-2,-1};
        List<Integer> res = new ArrayList<>();
        System.out.println(maxSubSum(arr, res));
        for (int i = res.get(0); i <= res.get(1); i++) {
            System.out.print(arr[i] + " ");
        }
//        printX(arr);
    }



//    private static void printX(int[] arr) {
//        int start = 0, end=0;
//        int cbest=arr[0],obest=arr[0];
//        for (int i=1; i<arr.length; i++) {
//            if (cbest >= 0) {
//                cbest += arr[i];
//            }else {
//                cbest = arr[i];
//                start = i;
//            }
//            if (cbest >= obest) {
//                obest = cbest;
//                end = i;
//            }
//        }
//        System.out.println("index from "+ start+","+end);
//    }
}
