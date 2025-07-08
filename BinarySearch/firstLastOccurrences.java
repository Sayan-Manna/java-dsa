package BinarySearch;

import java.util.Arrays;

// Leetcode-34
public class firstLastOccurrences {
    public static int lowerBound(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int index = arr.length;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (arr[mid] >= x) {
                index = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return index;
    }
    public static int upperBound(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int index = arr.length;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (arr[mid] > x) {
                index = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return index;
    }
    private static int firstOccur(int[] arr, int x) {
        int first = -1, low = 0, high=arr.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == x) {
                first = mid;
                high = mid-1;
            }else if (arr[mid] > x) {
                high = mid-1;
            }else low = mid+1;
        }
        return first;
    }
    private static int lastOccur(int[] arr, int x) {
        int last = -1, low = 0, high=arr.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == x) {
                last = mid;
                low = mid+1;
            }
            else if (arr[mid] < x) {
                low = mid+1;
            }else high = mid-1;
        }
        return last;
    }
    private static int[] findOccur(int[] arr, int target) {
        // Without lb and up - pure binary search
        int first = firstOccur(arr, target);
        if (first == -1) return new int[]{-1,-1};
        int last = lastOccur(arr,target);
        return new int[]{first, last};
        // -------------------------------------------------
        // Binary Search - using lower bound and upper bound O(2*logn) | O(1)
//        int lb = lowerBound(arr, target);
//        //edge cases
//        if (lb == arr.length || arr[lb] != target) {
//            return new int[]{-1,-1};
//        }
//        return new int[]{lb, upperBound(arr, target)-1};
        // -------------------------------------------------
//        // Brute-force - Linear search
//        int start = -1, end = -1;
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] == target) {
//                // update only once, if found
//                if (start == -1) {
//                    start = i;
//                }
//                end = i;
//            }
//        }
//        return new int[]{start,end};
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 11;
//        int[] arr = {5,7,7,8,8,10};
//        int target = 5;
        int[] res = findOccur(arr, target);
        // count occurrences

        System.out.println(Arrays.toString(res));
    }
}
