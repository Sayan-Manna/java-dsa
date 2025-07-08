package BinarySearch;

public class leastCapacityToShipWithinDdays {
    private static int findDays(int[] weights, int capcity) {
        int dayCount = 0;
        int sum = 0;
        for (int i=0; i<weights.length; i++) {
            sum += weights[i];
            if (sum > capcity) {
                dayCount++;
                sum = weights[i];
            }
        }
        return dayCount+1;

    }
    private static int leastWeightCapacity(int[] weights, int d) {
        //Find the maximum and the summation:
        int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
        // Binary Search | O(log(max-sum+1)*O(n))
        while (maxi <= sum) {
            int mid = maxi + ((sum-maxi) >> 1);
            if ((findDays(weights, mid)) <= d) {
                sum = mid - 1;
            }else {
                maxi = mid + 1;
            }
        }
        return maxi;
        // Brute-force | O((max-sum+1)*O(n))
//        for (int i = maxi; i <= sum; i++) {
//            if (findDays(weights, i) <= d) {
//                return i;
//            }
//        }
//        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(leastWeightCapacity(arr, days));
    }
}
