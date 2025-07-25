package StackAndQueue;


import static StackAndQueue.SumOfSubarrMinimums.sumOfSubarrMins;

public class SumOfSubarrRanges {
    private static int sumOfSubRanges(int[] arr) {
        long minSumSubarr = sumOfSubarrMins(arr);
        long
    }

    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(sumOfSubRanges(arr));
    }
}
