package BinarySearch;
// only one peak, and left of peak will be smaller and right of peak will be greater
// array must be at-least 3 size long
// mid can't be 0 => that's for sure
// lower value element must be present before peak
public class findPeakInMountainArr {
    private static int Peak(int[] arr) {
        // Golden-section search
        // Binary Search
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid])
                return mid;
            else if (arr[mid - 1] > arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
        // Brute-force : Linear search find the max element's index
    }

    public static void main(String[] args) {
        int[] arr = {1,5,1,2,1};
        System.out.println(Peak(arr));
    }
}
