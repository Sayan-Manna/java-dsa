package Arrays;

import java.util.Arrays;

public class rightRotation {
    static void rightRotationByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n-1];
        for (int i = n-2; i >= 0; --i) {
            arr[i+1] = arr[i];
        }
        arr[0] = last;
    }
    static void RightRotation(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            rightRotationByOne(arr);
        }
    }
    // Right Rotate by reversing  --  O(n) TC
    static void reverse(int[] arr, int low, int high) {
        for (int i=low, j=high; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void rightrorate_reverse(int[] arr, int d) {
        // reverse upto d
        reverse(arr, 0, arr.length-d-1); // 2,1
        // reverse after d
        reverse(arr, arr.length-d, arr.length-1); // 5,4,3
        // reverse whole
        reverse(arr, 0, arr.length-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};  // Output: 3 4 5 1 2 ----> 21 543
        int d = 3;
//        RightRotation(arr, d);
        rightrorate_reverse(arr, d);
        System.out.println(Arrays.toString(arr));
    }


}
