package BinarySearch;

public class searchInRotatedSorted2 {
    public static boolean searchInARotatedSortedArrayII(int []arr, int k) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            //find sorted half
            if (arr[mid] == k) return true;
            // Edge case
//            if (arr[mid] == arr[low] && arr[mid] == arr[high]) {
//                low++; high--;
//                continue;
//            }
            while (arr[mid] == arr[low] && arr[mid] == arr[high]) {
                low++;
                high--;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <=k && k <= arr[mid]) {
                    // element exists
                    high = mid-1;
                }else {
                    // element doesn't exist
                    low = mid+1;
                }
            }else {
                if (arr[mid] <= k && arr[high] >= k )
                    //element exists
                    low = mid + 1;
                else high = mid-1; //element doesn't exist
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 3, 3, 3, 3};
        int k = 5;
        boolean ans = searchInARotatedSortedArrayII(arr, k);
        if (!ans)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
