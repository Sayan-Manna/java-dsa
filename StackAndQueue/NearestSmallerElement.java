package StackAndQueue;

import java.util.Arrays;

public class NearestSmallerElement {
    private static int[] nse(int[] nums) {
        // Optimal ---------|
        


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
