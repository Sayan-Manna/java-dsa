package BinarySearch;
// Leetcode: 540
//You are given a sorted array consisting of only integers where every element appears exactly twice,
// except for one element which appears exactly once. Return the single element that appears only once
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
public class singleElemInSortedArr {
    private static int findSingle(int[] nums) {
        // Binary Search
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];
        // move both pointers by 1 step
        int low = 1, high = n-2;
        while (low <= high) {
            int mid = low + (high-low)/2;
            // Single Element found
            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            // find which half to search
            // (Even,Odd) => element in right
            if ((mid % 2 == 0 && nums[mid] == nums[mid+1]) || (mid % 2==1 && nums[mid]==nums[mid-1])) {
                low = mid + 1;
            }else { // (Odd, Even) => element in left
                high = mid - 1;
            }
        }
        return -1;
        // xor
        // Brute-force
    }

    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(findSingle(arr));
    }
}
