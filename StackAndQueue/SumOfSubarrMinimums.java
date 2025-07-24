package StackAndQueue;

import java.util.Stack;

public class SumOfSubarrMinimums {
    private static int sumOfSubarrMins(int[] arr) {
        // Optimal
        int mod = (int) (1e9 + 7);
        long sum = 0;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);

        for (int i=0; i<arr.length; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;
//            sum = (sum + ((right * left * mod) * arr[i] % mod)) % mod;
            sum =  sum + (left*right*arr[i])%1000000007;
        }
        return (int) sum;

        // Brute-force

    }

    private static int[] findPSEE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] psee = new int[n];
        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            psee[i] = !stack.isEmpty() ? stack.peek() : -1;
            stack.push(i);
        }
        return psee;
    }

    private static int[] findNSE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for (int i = n-1; i>=0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nse;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumOfSubarrMins(arr));
    }
}
