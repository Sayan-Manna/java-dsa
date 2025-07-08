package BinarySearch;

public class kokoEating {
    public static int findMax(int[] piles) {
        int max = -1;
        for (int i : piles) {
            max = Math.max(max, i);
        }
        return max;
    }
    private static int calculateTotalHours(int[] arr, int k) {
        int toltalH = 0;
        for (int i=0; i<arr.length; i++) toltalH += Math.ceil((double) (arr[i]) / (double) k);
        return toltalH;
    }
    private static int minEatingSpeed(int[] piles, int h) {
        int maxi = findMax(piles);
        // Binary Search
        int low = 1, high = maxi;
        while (low <= high) {
//            int mid = low + (high-low)/2;
            int mid = low + ((high-low) >> 1); // >> 1 is a bitwise right shift operation, which effectively divides the result of hi - lo by 2. It's a more efficient way to perform integer division by 2.
            int reqTime = calculateTotalHours(piles, mid);
            if (reqTime <= h)
                high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(arr, h));
    }
}
