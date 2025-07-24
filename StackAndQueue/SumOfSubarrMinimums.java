package StackAndQueue;

public class SumOfSubarrMinimums {
    private static int sumOfSubarrMins(int[] arr) {
        // Optimal
        int mod = (int) (1e9 + 7);
        long sum = 0;
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        


        // Brute-force

    }

    private static int[] findPSE(int[] arr) {
    }

    private static int[] findNSE(int[] arr) {
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumOfSubarrMins(arr));
    }
}
