package StackAndQueue;

import java.util.Stack;

public class TrappingRainWater {
    private static int trap(int[] arr) {
        // Optimal --------------------- O(N) | O(1)
        /*


         */
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int waterTrapped = 0;
        int maxLeft = 0, maxRight = 0;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] < maxLeft) {
                    waterTrapped += maxLeft - arr[left];

                } else {
                    maxLeft = arr[left];
                }
                left++;
            } else {
                if (arr[right] > maxRight) {
                    maxRight = arr[right];
                } else {
                    waterTrapped += maxRight - arr[right];
                }
                right--;
            }
        }
        return waterTrapped;

        // Monotonic Stack approach -----------
//        Stack<Integer> stack = new Stack<>();
//        int waterTrapped = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
//                int bottom = stack.pop();
//                if (stack.isEmpty()) break;
//
//                int distance = i - stack.peek() - 1;
//                int boundedHeight = Math.min(arr[i], arr[stack.peek()]) - arr[bottom];
//                waterTrapped += distance * boundedHeight;
//            }
//            stack.push(i);
//        }
//
//        return waterTrapped;




        // Better 2 -------------------- O(2N) | O(N)
        /*
        * replacing prefixMax with a running variable
            - PrefixMax can be calculated using arr[i] max later -> max(prefixMax, arr[i])
		* Calculating suffixMax on the fly during the backward pass.
        */
//        int n = arr.length;
//        int[] suffixMax = new int[n];
//        suffixMax[n - 1] = arr[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
//        }
//
//        int prefixMax = 0;
//        int waterTrapped = 0;
//        for (int i = 0; i < n; i++) {
//            prefixMax = Math.max(prefixMax, arr[i]);
//            if (arr[i] < prefixMax && arr[i] < suffixMax[i]) {
//                waterTrapped += Math.min(prefixMax, suffixMax[i]) - arr[i];
//            }
//        }
//        return waterTrapped;

        // Better 1 Prefix and Suffix Max Arrays (DP)-------------------- O(3N) | O(2N)
        /*
        * Almost same idea as Brute-force, because of the calc of leftMax and rightMax N^2 complexity we were getting
        * The complexity can be boiled down to O(1) if we precompute the leftMax and rightMax at each index -> prefixMax, suffixMax
        * Take 2 array prefix and suffix array and precompute the leftMax and rightMax for each index beforehand
        * Then use the same formula min(prefix[I], suffix[i])-arr[i] to compute water trapped at each index.
        */
//        int waterTrapped = 0;
//        int n =arr.length;
//        // calc prefixMax, [2,1,0,5,3] --after doing--> prefixMax[2,2,2,5,5]
//        int[] prefixMax = new int[n];
//        prefixMax[0] = arr[0];
//        for (int i=1; i<n; i++) {
//            prefixMax[i] = Math.max(arr[i], prefixMax[i-1]);
//        }
//        // calc suffixMax, [1,11,2,10] --after doing--> suffixMax[11,11,10,10]
//        int[] suffixMax = new int[n];
//        suffixMax[n-1] = arr[n-1];
//        for (int i=n-2; i>=0; --i) {
//            suffixMax[i] = Math.max(arr[i], suffixMax[i+1]);
//        }
//        // calc the trapped water
//        for (int i=0; i<n; i++) {
//            int leftMax = prefixMax[i]; // when i=0, leftMax = 0th element of prefixMax
//            int rightMax = suffixMax[i]; // when i=0, rightMax = 0th element of suffixMax
//            // only when I am between two buildings -> water will be trapped
//            if (arr[i] < leftMax && arr[i] < rightMax) {
//                waterTrapped += Math.min(leftMax, rightMax) - arr[i];
//            }
//        }
//        return waterTrapped;

        // Brute-force --------------- O(N^2) | O(1)
        /*
        * Idea is to get the leftMax and rightMax of current element
        * waterTrapped = min(leftMax, rightMax) - current element = In case of [2,0,3] -> water trapped height = min(2,3)-0=2
        */
        //--------
        /*
        [0,1,0,2,1,0,1,3,2,1,2,1], leftMax = 0, rightMax = 0

        * i=0 -> leftMax = max(0, leftMax(0)) = 0 ; rightMax = max(0,1,2,....1) = 3
            waterTrapped = min (0,3) - 0 = No water trapped
        * i=1 -> leftMax = max(1, leftMax(0)) = 1 ; rightMax = max(1,2,...1) = 3
            waterTrapped = min(1,3) - 1 = 0 -> No water trapped
        * i=2 -> leftMax = max(0, 1, 0) => If I am at 3rd element, on left side I have 0,1,0 (inclusive) hence max(0,1,0)
                rightMax = 3
                waterTrapped = min (1,3)-0 = 1 💧
        * ...

        */
//        int waterTrapped = 0;
//        int n = arr.length;
//        for (int i=0; i<n; i++) {
//            int j = i;
//            int leftMax = 0, rightMax = 0;
//            while (j >= 0) {
//                leftMax = Math.max(arr[j], leftMax);
//                --j;
//            }
//            j = i;
//            while (j < n) {
//                rightMax = Math.max(arr[j], rightMax);
//                ++j;
//            }
//            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
//        }
//        return waterTrapped;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
