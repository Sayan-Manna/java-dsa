package BinarySearch;

public class medianOfTwoSortedArr {
    private static double median(int[] nums1, int[] nums2) {
        // Optimized => O(log(min(n1,n2)) | O(1)
        int n1 = nums1.length, n2=nums2.length;
        // We only want to perform BS on smaller array
        if (n1 > n2) return median(nums2, nums1); // Genius ✨
        // no_of_element require in left
        int left = (n1 + n2 + 1) / 2;
        int n = n1+n2;
        // BS
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = low+high >> 1;
            // mid2 = total_no_in_left - mid1
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1) r1 = nums1[mid1];
            if (mid2 < n2) r2 = nums2[mid2];
            if (mid1 - 1 >= 0) l1 = nums1[mid1-1];
            if (mid2 - 1 >= 0) l2 = nums2[mid2-1];
            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                return (double) (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
            }
            else if (l1 > r2) high = mid1-1;
            else low = mid1 + 1;
        }
        return 0; //dummy

        // Better - space optimized => O(m+n) | O(1)
//        int elem1 = -1, elem2 = -1;
//        int n = nums1.length + nums2.length; // To get the required indices
//        int i=0, j=0, count=0;
//        while (i < nums1.length && j< nums2.length) {
//            if (nums1[i] < nums2[j]) {
//                if (count == n/2) elem1 = nums1[i++];
//                if (count == (n/2-1)) elem2 = nums1[i++];
//            }else {
//                if (count == n/2) elem1 = nums2[j++];
//                if (count == (n/2-1)) elem2 = nums2[j++];
//            }
//            count++;
//        }
//        while (i< nums1.length) {
//            if (count == n/2) elem1 = nums1[i++];
//            if (count == (n/2-1)) elem2 = nums1[i++];
//            count++;
//        }
//        while (j<nums2.length) {
//            if (count == n/2) elem1 = nums2[j++];
//            if (count == (n/2-1)) elem2 = nums2[j++];
//            count++;
//        }
//        // Find the median
//        if (n % 2 == 1) return elem2;
//        return ((double)(elem1+elem2))/2.0;
        // Brute-force : Using Merging logic of Merge Sort | O(m+n) | O(m+n)
    }
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 10, 12};
        int[] b = {2, 3, 6, 15};
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }
}
