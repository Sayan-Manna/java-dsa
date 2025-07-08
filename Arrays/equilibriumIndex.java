package Arrays;
//Input: nums = [1,-1,4]
//Output: 2
//Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
//The sum of the numbers after index 2 is: 0

public class equilibriumIndex {
    private static int findEquilibriumIdx(int[] arr, int n) {
//        for (int i=0; i<n; i++) {
//            int leftSum = 0;
//            for (int j = 0; j < i; j++) {
//                leftSum += arr[j];
//            }
//            int rightSum = 0;
//            for (int j=i+1; j<n; j++) {
//                rightSum += arr[j];
//            }
//            if (leftSum == rightSum) {
//                return i;
//            }
//        }
//        return -1;

        // Using Total Sum
        int sum = 0;
        int leftSum = 0;
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];

        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i
            if (leftSum == sum) {
                return i;
            }
            leftSum += arr[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int n = arr.length;
        int equilibriumidx = findEquilibriumIdx(arr, n);
        System.out.println(equilibriumidx);
    }
}
