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
        /* Algorithm
         * 1. Obviously I need the access for the right elements so I will start from the end
         * 2. for last elemet or other element when stack is empty then it is -1
         * 3. Now put elements in stack and check if the top element is greater than the current element -> if yes then it is the next greater element
               - So for [1,2,3,4] -> when I am at 2, 3 will be my next greater even though 4 > 3
         * 4. Now when stack is non-empty and current number is > stack top then pop the top element as this can't be the next greater element
                - So for [3,1,2,5] -> when I am at 3, stack contains [1,2,4,6] -> 1,2 are not the next greater elements -> pop them
        */
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
