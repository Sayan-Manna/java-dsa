package StackAndQueue;

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
        for (int i=0; i<arr.length; i++) {
            
        }

    }
}
