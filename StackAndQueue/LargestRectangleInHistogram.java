package StackAndQueue;


import java.util.Stack;

public class LargestRectangleInHistogram {

    public static int largestRectangleArea(int[] arr) {
        // Optimal 2 ------------- O(2N) | O(N)
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            while(!st.empty() && arr[st.peek()] > arr[i]) {
                int element = st.peek();
                st.pop();
                int nse = i;
                int pse = st.empty() ? -1 : st.peek();
                maxArea = Math.max(arr[element] * (nse - pse - 1), maxArea);
            }
            st.push(i);
        }

        while(!st.empty()) {
            int nse = n;
            int element = st.peek();
            st.pop();
            int pse = st.empty() ? -1 : st.peek();
            maxArea = Math.max(arr[element] * (nse - pse - 1), maxArea);
        }

        return maxArea;

        // Optimal 1 ------------- O(5N) | O(4N)
        /*
        * The intuition behind the approach is the same as finding the smaller element on both sides but in an optimized way
        * using the concept of the next greater element and the next smaller element.
        * [1,5,6,2] -> If I am at 5, the rectangle I can form taking 5 and 6. Formation stops at pse and nse
        */
//        int maxArea = Integer.MIN_VALUE;
//        int[] pse = findPSE(arr);
//        int[] nse = findNSE(arr);
//        for (int i=0; i<arr.length; i++) {
//            int area = arr[i] * (nse[i]-pse[i]-1);
//            maxArea = Math.max(area, maxArea);
//        }
//        return maxArea;

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

    private static int[] findNSE(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >=0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        return nse;

    }

    private static int[] findPSE(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        return pse;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
