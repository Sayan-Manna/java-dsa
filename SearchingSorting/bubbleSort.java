package SearchingSorting;

import java.util.Arrays;

public class bubbleSort {
    private static void Sort(int[] arr, int n) {
//        boolean swapped = false;
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=0; j<arr.length-i-1; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // Recursive
        if (arr.length == 0 || arr.length == 1) {
            return;
        }
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
        Sort(arr, n-1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        Sort(arr, arr.length);
        Arrays.toString(arr);
    }
}
