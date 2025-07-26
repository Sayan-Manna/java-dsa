package StackAndQueue;


import java.util.Stack;

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
        int[] ngee = findNGEE(arr);
        int[] pge = findPGE(arr);
        for (int i=0; i<arr.length; i++) {
            long left = i - pge[i];
            long right = ngee[i] - i;
            long contrib = ((left * right) % mod * arr[i]) % mod;
            sum = (sum + contrib) % mod;
        }
        return (int) sum;
    }
    public static int[] findNGEE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] ngee = new int[n];
        for (int i = n-1; i>=0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            ngee[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return ngee;
    }
    public static int[] findPGE(int[] arr) {
        int n = arr.length;
        int[] pge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            pge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pge;
    }
    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(sumOfSubRanges(arr));
    }
}
