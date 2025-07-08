package Arrays.Medium;
// LC - 2765
// https://leetcode.com/problems/longest-alternating-subarray/description/?source=submission-ac
// https://leetcode.com/problems/longest-alternating-subarray/solutions/3737249/java-two-pointers-beats-100-o-n-t-c/?source=submission-ac
public class longestAlterSubarrLC {
    private static void Solution(int[] nums) {
        // 2 -pointer => O(n)
        int i = 0, j = 1, diff = 1, n = nums.length, len = -1;
        while (j < n) {
            if (nums[j] - nums[j - 1] != diff) {
                if (nums[j] - nums[j - 1] == 1) {
                    i = j - 1;
                } else {
                    i = j;
                    j++;
                }
                diff = 1;
                continue;
            }
            len = Math.max(len, j - i + 1);
            diff = diff > 0 ? -1 : 1;
            j++;
        }

        // Naive => O(n^2)

        System.out.println(len);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4};
        Solution(arr);

    }
}
