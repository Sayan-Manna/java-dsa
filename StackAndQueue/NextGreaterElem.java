package StackAndQueue;

import java.util.Stack;

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

        // Using monotonic stack
        //
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for (int i=n-1; i>=0; i--){
            while (!st.empty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.empty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        return nge;


        // Brute-force - non - circular --------------|
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
        * next index = (i+j) % n -> ensures we start from the next position after i and move circularly
        * as circular no need the extra last element check
         */

    }
}
