package BinarySearch;

public class findMinInRotatedSorted2 {
    private static int findTheLeaseOne(int[] nums) {
        // Binary search approach => WC: O(n)
        int low = 0, high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high-low)/2;
            // Edge case
            if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                ans = Math.min(ans, nums[low]);
                low++; high--;
                continue;
            }
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findTheLeaseOne(arr));
    }
}
