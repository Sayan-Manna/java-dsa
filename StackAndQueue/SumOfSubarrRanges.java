package StackAndQueue;


import static StackAndQueue.SumOfSubarrMinimums.sumOfSubarrMins;

public class SumOfSubarrRanges {
    private static long sumOfSubRanges(int[] arr) {
        long minSumSubarr = sumOfSubarrMins(arr);
        long maxSumSubarr = sumOfSubarrMax(arr);
        return maxSumSubarr - minSumSubarr;
    }

    private static long sumOfSubarrMax(int[] arr) {
        int mod = (int) (1e9 + 7);
        long sum = 0;
        int[] nge = 
    }

    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(sumOfSubRanges(arr));
    }
}
