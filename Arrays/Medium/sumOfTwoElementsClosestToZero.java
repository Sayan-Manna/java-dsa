package Arrays.Medium;
// same as 2 sum closest
public class sumOfTwoElementsClosestToZero {
    public static int closestToZero (int arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length-1; i++) {
            int sum = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                sum += arr[j];
                if (Math.abs(sum) < min) {
                    min = sum;
                }
                break;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {-21, -67, -37, -18, 4, -65};
        System.out.println(closestToZero(arr, arr.length));
    }
}
