package Arrays;
// leetcode-485
// Given a binary array nums, return the maximum number of consecutive 1's in the array
//Input: nums = [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s.
//        The maximum number of consecutive 1s is 3.
public class maxConsecutive1 {
    private static void Solution(int[] arr) {
        int count = 0;
        int maxCount = 0; // to store the largest count
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        Solution(arr);
    }
}
