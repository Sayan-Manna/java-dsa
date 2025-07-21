package StackAndQueue;

import java.util.Arrays;

public class NextGreaterElem {
    public static void main(String[] args) {
        int arr[]={5,7,1,2,6,0};

        int arr2[] = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static int[] nextGreaterElements(int[] arr) {
        // Brute-force
        /*
        * So fix one check if any num > fixed curr no.
         */
        int[] nge = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                }
                break;
            }
        }
        return nge;

    }
}
