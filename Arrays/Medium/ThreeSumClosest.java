package Arrays.Medium;
import java.util.Arrays;
// Leetcode - 16
public class ThreeSumClosest {
    // O(n^2)
    public static int threeSumClosest(int[] nums, int target) {
        // Optimal : TC: O(nlogn+n^2)
        Arrays.sort(nums);
        long closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - closestSum) > Math.abs(target - sum)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return (int) closestSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }
}
