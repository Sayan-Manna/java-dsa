package BinarySearch;
// same as painter's partition
// same as book allocation
// LC: 410
import java.util.Arrays;
import static BinarySearch.allocatingBooks.countStudents;

public class splitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        if (k > nums.length) return -1;
        // max in array
        int low = Arrays.stream(nums).max().getAsInt();
        // sum of arr
        int high = Arrays.stream(nums).sum();
        // Binary Search
//        while (low <= high) {
//            int mid = low + ((high-low) >> 1);
//            if (countStudents(nums, mid) > k) low=mid+1;
//            else high = mid-1;
//        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}
