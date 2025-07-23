package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    private static int[] nse(int[] nums) {
        // Optimal ---------|
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] nge = new int[n];
        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (i < n) {
                nge[i] = !stack.isEmpty() ? stack.peek() : -1;
            }
            stack.push(arr[i%n]);
        }
        return nge;


        // Brute-force
//        int n = nums.length;
//        int[] nse = new int[n];
//        for (int i=0; i<n; i++) {
//            boolean found = false;
//            for (int j = 0; j<i; ++j) {
//                if (nums[j] < nums[i]) {
//                    nse[i] = nums[j];
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) nse[i] = -1;
//        }
//        return nse;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,2,10,8};

        int[] res = nse(nums1);
        System.out.println(Arrays.toString(res));
    }
}
