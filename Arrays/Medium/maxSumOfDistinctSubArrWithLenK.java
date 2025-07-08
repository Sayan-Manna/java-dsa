package Arrays.Medium;
// LC-2461
// Input: nums = [1,5,4,2,9,9,9], k = 3
//Output: 15
//Explanation: The sub-arrays of nums with length 3 are:
//- [1,5,4] which meets the requirements and has a sum of 10.
//- [5,4,2] which meets the requirements and has a sum of 11.
//- [4,2,9] which meets the requirements and has a sum of 15.
//- [2,9,9] which does not meet the requirements because the element 9 is repeated.
//- [9,9,9] which does not meet the requirements because the element 9 is repeated.
//We return 15 because it is the maximum subarray sum of all the sub-arrays that meet the conditions
public class maxSumOfDistinctSubArrWithLenK {
    private static void maxSum(int[] arr, int k) {
        // Sliding window + Map
        // Why Set is not used here??
        // Naive => O(n^2)
//        long maxSum = 0;
//        for (int i=0; i<=arr.length-k; i++) {
//            boolean[] visited = new boolean[100001];
//            boolean distinct = true;
//            int sum = 0;
//            for (int j=i; j<i+k; j++) {
//                if (visited[arr[j]]) {
//                    distinct = false;
//                    break;
//                }
//                // by default boolean arr stores false in all indices
//                visited[arr[j]] = true;
//                sum += arr[j];
//            }
//            if (distinct)
//                maxSum = Math.max(sum, maxSum);
//        }
//        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,7,8,9};
        int k = 3;
        maxSum(arr, k);
    }
    // 1+7+8=>16
    // 7+8+9 => 24
}
