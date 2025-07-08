package BinarySearch;
public class smallestDivisorGivenThreshold {
    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
    private boolean Possible(int[] arr, int divisor, int threshold) {
        int sum = 0;
        for (int i=0; i< arr.length; i++) {
            sum += Math.ceil((double) arr[i]/(double) divisor);
        }
        return sum <= threshold;
    }

    private int smallestDivisor(int[] nums, int threshold) {
        // Binary Search | O(log(max(arr[]))*n) ------------------------------------
        int low = 1, high = findMax(nums);
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (Possible(nums, mid, threshold)) {
                high = mid-1;
            }else low = mid+1;
        }
        return low;
        // Brute-force ------------------------------------
//        int maxi=findMax(nums);
//        for (int divisor=1; divisor<=maxi; divisor++) {
//            int sum = 0;
//            for (int i=0; i< nums.length; i++) {
//                sum += Math.ceil((double) nums[i]/(double) divisor);
//            }
//            if (sum <= threshold) return divisor;
//        }
        // or
//        int mini = 1;
//        while (mini <= maxi) {
//            int sum = 0;
//            for (int i=0; i<nums.length; i++) {
//                sum += Math.ceil((double) nums[i]/(double) mini);
//            }
//            if (sum <= threshold) return mini;
//            else mini++;
//        }
//        return -1;
    }
    public static void main(String[] args) {
        smallestDivisorGivenThreshold obj = new smallestDivisorGivenThreshold();
        int[] arr = {44,22,33,11,1};
        int threshold = 5;

        System.out.println(obj.smallestDivisor(arr, threshold));
    }
}
