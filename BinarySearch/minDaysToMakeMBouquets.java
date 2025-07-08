package BinarySearch;
import static BinarySearch.kokoEating.findMax;

public class minDaysToMakeMBouquets {
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }
    public static boolean possible(int[] arr, int day, int m, int k) {
        int count = 0;
        int noOfB = 0;
        // count no of bouquets
        for (int i=0; i<arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            }else {
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k); // for the last
        return noOfB >= m;
    }
    private static int findMinDays(int[] bloomDay, int m, int k) {
        // Binary Search | O(log((max(arr[])-min(arr[])+1)) * n) ----------------------------
        if ((long) m*k > bloomDay.length) return -1;
        int low = findMin(bloomDay), high = findMax(bloomDay);
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (possible(bloomDay, mid, m, k)) {
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return low;
        // DP O(M*N)
//        ------------------------------
        // Sliding Window | O(N) + O(max(m) * max(k)) => O(n^2)
//        ------------------------------
//        // Brute-force | O((max(arr[])-min(arr[])+1) * n) ------------------------------
//        long val = (long) m*k;
//        //Impossible case
//        if (val > bloomDay.length) return -1;
//        int mini = findMin(bloomDay), maxi = findMax(bloomDay);
//        for (int i=mini; i<= maxi; i++) {
//            if (possible(bloomDay, i, m, k)) {
//                return i;
//            }
//        }
//        return -1;
    }
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int m = 2, k = 3;
        System.out.println(findMinDays(bloomDay, m , k));
    }
}
