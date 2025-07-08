package Arrays;
import java.util.Arrays;
// Leetcode-66: You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//Example 1:
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
public class PlusOne {
    static int[] Solution(int[] arr) {
        int n = arr.length;
        for (int i=n-1; i>=0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
//                break;
                return arr;
            }else{
                arr[i] = 0;
            }
        }
        if (arr[0] == 0) {
//            int[] newArr = new int[n+1];
            arr = new int[n+1];
            arr[0] = 1;
//            return newArr;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int[] ans = Solution(arr);
        System.out.println(Arrays.toString(ans));
    }
}
