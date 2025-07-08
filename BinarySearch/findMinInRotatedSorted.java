package BinarySearch;
//[4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//Given the sorted rotated array nums of unique elements, return the minimum element of this array
public class findMinInRotatedSorted {
    private static int findSmallestOne(int[] nums) {
        // Binary search approach - 1
        int low = 0, high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high-low)/2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (nums[low] <= nums[high]) {
                ans = nums[low];
                break;
            }
            // If left half is sorted
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans,nums[low]);
                // Eliminate left half
                low = mid + 1;
            } else { // if right half is sorted:
                ans = Math.min(ans, nums[mid]);
                // Eliminate right half
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findSmallestOne(arr));
    }
}
