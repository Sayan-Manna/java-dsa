package BinarySearch;

public class recursiveBinarySearch {
    static int recurBS(int[] arr, int low, int high, int k) {
        //base case - when it stops
        if (low > high) return -1;

        int mid = low + (high-low)/2;
        if (arr[mid] == k) return mid;
        else if (k > arr[mid]) return recurBS(arr, mid+1, high, k);
        return recurBS(arr, low, mid-1, k);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 6;
        int low = 0, high = arr.length-1;
        System.out.println(recurBS(arr, low, high, k));

    }
}
