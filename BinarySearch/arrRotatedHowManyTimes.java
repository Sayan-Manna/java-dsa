package BinarySearch;

public class arrRotatedHowManyTimes {
    private static void findRotationNo(int[] arr) {
        int ans = Integer.MAX_VALUE, index = -1;
        // Binary Search
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[low] <= arr[high]) {
                ans = 0;
                break;
            }
            // If left half is sorted
            if (arr[low] <= arr[mid]) {
                // keep the minimum
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                // Eliminate left half
                low = mid + 1;
            } else { // if right half is sorted:
                // keep the minimum
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                // Eliminate right half
                high = mid - 1;
            }
        }
        // Brute-force : find the index of the min
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] < ans) {
//                ans = arr[i];
//                index = i;
//            }
//        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        findRotationNo(arr);
    }
}
