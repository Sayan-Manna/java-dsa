package Arrays;

import java.util.Arrays;

//N = 8, K = 3
//        Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
//        Output: 1 2 6 4 5 3 7 8
//        Explanation: Kth element from beginning is
//        3 and from end is 6
public class swapKthIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        // Swap
//        int temp = arr[k-1];
//        arr[k-1] = arr[arr.length-k];
//        arr[arr.length-k] = temp;
        //---------------
        // As same position from low and high, so once low reaches to k, high also reaches
        // to the equivalent position if we keep increasing and decreasing low and high
        int l=0;
        int h = arr.length-1;
        int count=1; //to count upto k, once hit swap two elements
        while (count != k) { //0<3, 1<3, 2 < 3
            l++;
            h--;
            count++;
        }
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
