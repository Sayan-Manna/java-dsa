package StackAndQueue;


import static StackAndQueue.SumOfSubarrMinimums.sumOfSubarrMins;

public class SumOfSubarrRanges {
    private static long sumOfSubRanges(int[] arr) {
        long minSumSubarr = sumOfSubarrMins(arr);
        long maxSumSubarr = sumOfSubarrMax(arr);
        return maxSumSubarr - minSumSubarr;
    }

    private static long sumOfSubarrMax(int[] arr) {
        int mod = 
    }

    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(sumOfSubRanges(arr));
    }
}
