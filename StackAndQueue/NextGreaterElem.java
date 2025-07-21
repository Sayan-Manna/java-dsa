package StackAndQueue;

public class NextGreaterElem {
    public static void main(String[] args) {
        int arr[]={4,5,2,25};
//        int arr[]={5,7,1,7,6,0};

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
        for (int i=0; i<arr.length-1; i++) {
            boolean isPresent = false;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) nge[i] = -1;
        }
        return nge;
    }
}
