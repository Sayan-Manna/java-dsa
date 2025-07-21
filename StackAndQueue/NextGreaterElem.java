package StackAndQueue;

public class NextGreaterElem {
    public static void main(String[] args) {
//        int arr[]={4,5,2,25};
        int arr[]={5,7,1,7,6,0};

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
        int n = arr.length;
        int[] nge = new int[n];
        boolean isPresent = false;
        for (int i=0; i<n-1; i++) {
            isPresent = false;
            for (int j=i+1; j<n; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) nge[i] = -1;
        }
        if (isPresent) nge[n-1] = -1;
        return nge;
    }
}
