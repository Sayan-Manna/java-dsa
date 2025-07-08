package SearchingSorting;

import java.util.Arrays;
public class mergeSort {
    static void merge(int[] arr, int si, int mid, int ei) {
        // extra space
        int[] merged = new int[ei-si+1];
        // index1 => tracking 1st half array, index2 => tracking 2nd half of array
        int index1 = si, index2 = mid+1;
        int tracker = 0;
        // [1,2,3] [2,3,4] => [  ]
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[tracker++] = arr[index1++];
            }else {
                merged[tracker++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merged[tracker++] = arr[index1++];
        }
        while (index2 <= ei) {
            merged[tracker++] = arr[index2++];
        }
        // copy to main array
        for (int i=0, j=si; i< merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }
    // Main function that sorts arr[l..r] using
    // merge()
    static void divide(int arr[], int l, int r) {
        // Base case : if single element before or after divide
        if (l >= r) return;
        int m = l + (r - l) / 2;
        // Sort first and second halves
        divide(arr, l, m);
        divide(arr, m + 1, r);

        // Merge the sorted halves
        merge(arr, l, m, r);

    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,-2,3,4,5};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
