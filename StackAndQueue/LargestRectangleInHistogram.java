package StackAndQueue;

public class LargestRectangleInHistogram {

    private static int largestRectangleArea(int[] arr) {
        // Optimal 2 -------------


        // Optimal 1 -------------
        /*
        * The intuition behind the approach is the same as finding the smaller element on both sides but in an optimized way
        * using the concept of the next greater element and the next smaller element.
        * [1,5,6,2] -> If I am at 5, the rectangle I can form taking 5 and 6. Formation stops at pse and nse
        */
        int maxArea = Integer.MIN_VALUE;





        // Brute-force -------- O(N^2) | O(1)
//        int maxArea = 0;
//        for (int i=0; i<arr.length; i++) {
//            // Expand left -> when i=0, calc expanding right only so left > 0
//            int left = i;
//            while (left > 0 && arr[left-1] >= arr[i]) {
//                left--;
//            }
//            // Expand right -> when i=n-1, calc expanding left only so right < n-1
//            int right = i;
//            while (right < arr.length-1 && arr[right+1] >= arr[i]) {
//                right++;
//            }
//
//            int width = right - left + 1;
//            int area = arr[i] * width;
//            maxArea = Math.max(area, maxArea);
//        }
//        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
