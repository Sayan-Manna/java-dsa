package Arrays;
// Leetcode - 26
// Find Non-repeating elements in an array
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {
    static int removeDup(int[] arr) {
        // Using Two Pointer
        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1; // return the size
        /*
          0 1 2 3 4 5 6
         [1 1 2 2 3 4 5]
         i=0, j=1
         -> arr[1] != arr[0] False --> j++
         -> arr[2] != arr[0] True --> i++ --> arr[1] = arr[2] ==> update 2nd 1 to 2
         ->
        ...
        - Basically take 2 pointers, j from 1 and i is at 0
        - Now if my jth element is not equal to ith element,
            - That means i-th element is unique
            - then I will increment i and put the jth element in the ith position.
                WHY:: There might be duplicate after i -> not j is also unique -> so why not place that j-th element in i++th position
        - Now if jth element is equal to ith element, then j++ as I have to find one unique.
         */


        // Using HashSet
        /*
        Declare a HashSet.
        Run a for loop from starting to the end.
        Put every element of the array in the set.
        Store size of the set in a variable K.
        Now put all elements of the set in the array from the starting of the array.
        Return K.
         */
//        HashSet < Integer > set = new HashSet < > ();
//        for (int k : arr) {
//            set.add(k);
//        }
//        int k = set.size();
//        int j = 0;
//        for (int x: set) {
//            arr[j] = x;
//            j++;
//        }
//        return k;
// OR--------------
//        int j = 0;
//        for (int i=0; i<arr.length; i++) {
//            if (!set.contains(arr[i])) {
//                set.add(arr[i]);
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 2, 2, 5, 5, 4};
        int k = removeDup(arr); // returns the number of distinct elements in array
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
