package StackAndQueue;

import java.util.Arrays;

public class NearestSmallerElement {
    private static int[] nse(int[] nums) {
        // Brute-force
        int n = nums.length;
        int[] nse = new int[n];
        for (int i=0; i<n; i++) {
            boolean found = false;
            for (int j = i-1; i>=0; --i) {
                if (nums[j] < nums[i]) {
                    nse[i] = nums[j];
                    found = true;
                }
            }
            if (!found) nse[i] = -1;
        }
        return nse;
    }

    public static void main(String[] args) {
        int[] nums1 = {12,1,11};

        int[] res = nse(nums1);
        System.out.println(Arrays.toString(res));
    }
}
