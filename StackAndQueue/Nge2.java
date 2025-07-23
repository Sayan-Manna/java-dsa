package StackAndQueue;

import java.util.Arrays;

public class Nge2 {
    public static int[] nge2(int[] arr) {
        // Brute-force - 2
        int n = arr.length;
        int[] nge = new int[n];
        for (int i=0; i<n; i++) {
            boolean isPresent = false;
            for (int j=i+1; j<i+n; j++) {
                int idx = j % n;
                if (arr[idx] > arr[i]) {
                    nge[i] = arr[idx];
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) nge[i] = -1;
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] nums1 = {12,1,11};

        int[] res = nge2(nums1);
        System.out.println(Arrays.toString(res));
    }
}
