package StackAndQueue;

public class LargestRectangleInHistogram {

    private static int largestRectangleArea(int[] arr) {
        // Brute-force
        for (int i=0; i<arr.length; i++) {

            for (int j=0; j<=i; j++) {
                if (arr[j] >= arr[i]) {
                    
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
