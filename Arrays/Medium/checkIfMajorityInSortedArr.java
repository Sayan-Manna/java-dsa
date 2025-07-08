package Arrays.Medium;
// Leetcode- 1150:
// Given an array nums sorted in non-decreasing order, and a number target, return True if and only if target is a majority element.
//A majority element is an element that appears more than N/2 times in an array of length N.
//Input: nums = [10,100,101,101], target = 101
//Output: false
//Explanation:
//        The value 101 appears 2 times and the length of the array is 4.
//        Thus, 101 is not a majority element because 2 > 4/2 is false
public class checkIfMajorityInSortedArr {
    static boolean isMajority(int[] arr, int target) {
        // Binary Search

        // As the array is sorted : O(n)/O(1)
        int majority = -1;
        int count = 1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }else{
                count=1; // as arr[] sorted so no need count--
            }
            if (count > arr.length/2) {
                majority = arr[i];
            }
        }
        return majority==target;
    }
    public static void main(String[] args) {
        int[] arr= {10,100,101,101};
        int target = 101;
        System.out.println(isMajority(arr, target));
    }
}
