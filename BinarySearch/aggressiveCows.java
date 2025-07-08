package BinarySearch;
// Similar problem : 1552,
// Similar ques : The city is affected with  Covid 19 and hospitals are filling up with patients.
//As a doctor , you need to make sure the patients are treated well. To do so You have some patients and beds for them to be allocated and the survival rate of the patients will be higher only if they are placed as far as possible.
//Given m beds and n patients maximize the minimum distance between any two patients to increase the survival rate.
//Ans : Same Binary Search approach
//This problem is based upon Aggressive Cows problem.
//        Ques. No. 1870
//        Ques. No. 875
//        Ques. No. 1283
//        Ques. No. 1482
//        Ques. No. 2064
// Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1 ... xN (0 <= xi <= 1,000,000,000).
//

import java.util.Arrays;

public class aggressiveCows {
    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; //place next cow.
                last = stalls[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
    private static int largestMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int limit = stalls[stalls.length-1] - stalls[0];
        // Binary Search
        int low = 1, high = limit;
        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, cows) == true) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return high;
        // Brute-force
//        for (int i=1; i<=limit; i++) {
//            if (canWePlace(stalls, i, cows) == false) {
//                return (i - 1);
//            }
//        }
//        return limit;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int cows = 3;
        System.out.println(largestMinDistance(arr, cows));
    }
}
