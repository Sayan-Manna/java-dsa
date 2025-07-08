package Arrays;

import java.util.Arrays;

public class TwoSumClosest {
    public static void main(String[] args) {
//        int[] arr = {10, 20,30};
//        int target = 15;
//        int[] arr = {10,30,20,5};
//        int target = 25;
        int[] arr = {5,2,7,1,4};
        int target = 10;
        Solution(arr, target);
    }

    private static void Solution(int[] arr, int target) {
        int[] ans = new int[2];
        // 2 pointer :: O(nlogn+n) Time and O(1) Space
        // Better : Binary Search :: O(2*nlogn) Time and O(1) Space



//       // Brute-force
//        int minDiff = Integer.MAX_VALUE;
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                int sum = arr[i]+arr[j];
//                // abs difference
//                int diff = Math.abs(sum-target);
//                if (minDiff > diff) {
//                    minDiff = diff;
//                    ans[0] = Math.min(arr[i],arr[j]);
//                    ans[1] = Math.max(arr[i],arr[j]);
//                }else if (minDiff == diff && (ans[1]-ans[0]) < Math.abs(arr[i]-arr[j])) {
//                    ans[0] = Math.min(arr[i],arr[j]);
//                    ans[1] = Math.max(arr[i],arr[j]);
//
//                }
//            }
//        }
        System.out.println(Arrays.toString(ans));
    }
}
