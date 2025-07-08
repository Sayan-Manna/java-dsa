package Arrays;
// Same as Two sum closest
// An Array of integers is given, both +ve and -ve.
// You need to find the two elements such that their sum is closest to zero.
//[1, 60, -10, 70, -80, 85]
//o/p: -80 and 85.
public class twoElemsSumClosestToZero {
    private static void minAbsSumPair(int[] arr, int n) {
        // Brute-force
        int minSum = Integer.MAX_VALUE;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                int sum = arr[i]+arr[j];
                minSum = Math.min(sum, minSum);
            }
        }
        System.out.println(minSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr, 6);
    }
}
