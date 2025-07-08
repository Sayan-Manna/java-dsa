package BinarySearch;
public class findPeak {
    private static int Peak(int[] nums) {
        // Binary Search
        if (nums.length == 1 || nums[0] > nums[1]) return 0;
        if (nums[nums.length-1] > nums[nums.length-2]) return (nums.length-1);
        int low = 1, high = nums.length-2;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
            // increasing slope
            else if (nums[mid] > nums[mid-1])
                low = mid+1;
            // Decreasing slope + reverse peak
            else high = mid - 1; // won't be low=mid+1 again as we are also considering decreasing slope
            // or
//            else if (nums[mid] > nums[mid+1]) {
//                high = mid-1;
//            }else {
//                high = mid-1; // or low = mid+1
//            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,1,2,1};
        System.out.println(Peak(arr));
    }

}
