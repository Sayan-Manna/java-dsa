package StackAndQueue;

import java.util.Arrays;

// LC: 496
/*
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
*/
public class Nge1 {

    private static int[] nge1(int[] nums1, int[] nums2) {
        // Brute-force
        int n1 = nums1.length, n2=nums2.length;
        int[] nge = new int[n1];

        // 1st check which number's nge we need to find out
        for (int i=0; i<n1; i++){
            int target = nums1[i];
            boolean found = false;

            // find the nge for the target number
            for (int j=0; j<n2; j++) {
                if (nums2[j] == target) {
                    found = true; // we found the target number in nums2[], now find the nge
                    boolean hasNge = false;

                    for (int k = j+1; k<n2; k++) {
                        if (nums2)
                    }

                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] res = nge1(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }
}
