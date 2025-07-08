package BinarySearch;
// Leetcode-33
// There is an integer array nums sorted in ascending order (with **distinct values**)
// Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
import java.util.*;
public class searchInRotatedSorted {
    private static int Search(List<Integer> arr, int n, int x) {
        int low = 0, high = n-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            //find sorted half
            if (arr.get(mid) == x) return mid;
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <=x && x <= arr.get(mid)) {
                    // element exists
                    high = mid-1;
                }else {
                    // element doesn't exist
                    low = mid+1;
                }
            }else {
                if (arr.get(mid) <= x && arr.get(high) >= x )
                    //element exists
                    low = mid + 1;
                else high = mid-1; //element doesn't exist
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = 9, k = 1;
        int ans = Search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
