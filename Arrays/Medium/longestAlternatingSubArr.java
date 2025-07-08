package Arrays.Medium;
import java.util.*;
//Given an array containing positive and negative elements, find a subarray with alternating positive and negative elements, and in which the subarray is as long as possible.[+-+-...]
// { 1, -2, 6, 4, -3, 2, -4, -3 }.
// o/p: { 4, -3, 2, -4 }. Note that the longest alternating subarray might not be unique.
public class longestAlternatingSubArr {
    private static void findLongestSubarray(int[] arr) {
        int currLen = 1, maxLen = 1;
        int end = 0;
        for (int i=1; i<arr.length;i++) {
            // if alternate sign present
            if (arr[i] * arr[i-1] < 0) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                    end = i;
                }
            }else{
                currLen = 1;
            }
        }
//        int[] subarray = Arrays.copyOfRange(arr, (end - maxLen + 1), end + 1);
//        System.out.println(Arrays.toString(subarray));
        for (int i=(end+1-maxLen); i<end+1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(maxLen);
    }


    public static void main(String[] args) {
        int[] nums = { 1, -2, 6, 4, -3, 2, -4, -3 };
        findLongestSubarray(nums);
    }
}
