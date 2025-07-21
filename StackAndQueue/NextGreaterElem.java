package StackAndQueue;

public class NextGreaterElem {
    public static void main(String[] args) {
//        int arr[]={4,5,2,25};
//        int arr[]={5,7,1,7,6,0};
        int arr[] = {6,0,8,1,3};

        int arr2[] = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static int[] nextGreaterElements(int[] arr) {
        // Brute-force - non - circular
        /*
        * So fix one check if any num > fixed curr no.
         */
//        int n = arr.length;
//        int[] nge = new int[n];
//        for (int i=0; i<n-1; i++) {
//            boolean isPresent = false;
//            for (int j=i+1; j<n; j++) {
//                if (arr[j] > arr[i]) {
//                    nge[i] = arr[j];
//                    isPresent = true;
//                    break;
//
//                }
//            }
//            if (!isPresent) nge[i] = -1;
//        }
//        nge[n-1] = -1; //when loop ends and last element is not traversed
//        return nge;

        // for circular :
        /*
        * 2nd loop starts from 1,
        * next index = (i+j) % n
        * as circular no need the extra last element check
         */

    }
}
