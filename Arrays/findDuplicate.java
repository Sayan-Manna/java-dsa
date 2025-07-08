package Arrays;
import java.util.Arrays;
// Leetcode - 287, 142
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and uses only constant extra space
public class findDuplicate {
    private static int findDup(int[] arr) {
        // Brute : Nested loop, for i=0->n for j=i+1->n
        // Sorting

        // Binary Search (Pigeonhole principle)
        // Sort + XOR
//        int len = arr.length;
//        int ans=0;
//        Arrays.sort(arr);
//        for (int i=0; i<len-1;i++) {
//            if ((arr[i]^arr[i+1]) == 0) {
//                ans = arr[i];
//                break;
//            }
//        }
//        return ans;

        // LL cyclic
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);

        fast = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
        // we can also use Negative Marking method, however it'll temporarily modify the array
        // With O(1) space making -ve marking
//        for (int i : arr) {
//            int index = Math.abs(i);
//            if (arr[index] < 0) {
//                return index;
//            }else{
//                arr[index] = -arr[index];
//            }
//        }
//        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,6,9,3,8,9,7,1};
        System.out.println(findDup(arr));
//        findDup(arr);
    }
}
