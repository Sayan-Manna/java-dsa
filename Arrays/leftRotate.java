package Arrays;

import java.util.Arrays;

public class leftRotate {
    // TC: O(n * d)
    /*
    # w/o reverse
    d=d%n
    for (i -> d-1)
      leftRotateByOne(arr) -> basically 1st elem will go to last, 2nd elem to prev last shifts



     */
    static void leftRotateByOne(int[] arr) {
        int first = arr[0];
        for (int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i]; // shift
        }
        arr[arr.length-1] = first;
    }
    // leftRotate till d using leftRotateByOne
    static void leftrotate(int[] arr, int d) {
//        if (d < 0 || d > arr.length)
//            return;
        int shift = d % arr.length;
        for (int i=0; i<shift; i++) {
            leftRotateByOne(arr);
        }
    }

    // Left Rotate by reversing  --  O(n) TC
    /*
    # reverse method
    - d = d % n (for 1 we don't need modulo)
    - reverse(low=0, high=d-1) : reverse till d -> we are passing index so 0 to d-1
    - reverse(d, n-1) : rest of the part
    - reverse(0, n-1) : rev whole arr

     */
    static void reverse(int[] arr, int low, int high) {
        for (int i=low, j=high; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void leftrorate_reverse(int[] arr, int d) {
        int shift = d % arr.length;
        // reverse upto d
        reverse(arr, 0, shift-1); // 2,1
        // reverse after d
        reverse(arr, shift, arr.length-1); // 5,4,3
        // reverse whole
        reverse(arr, 0, arr.length-1); // 2,1,5,4,3 => 3,4,5,1,2

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 7;
        int d1=1;
        leftrotate(arr, d1);
//        leftrorate_reverse(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}