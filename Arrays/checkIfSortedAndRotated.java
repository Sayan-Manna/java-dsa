package Arrays;
// leetcode:1752
public class checkIfSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(Check(arr));
    }

    private static boolean Check(int[] arr) {
        int count=0; // To count number of pairs

        // starting from 2nd element as for i=0=>ArrayIndexOutOfBounds
//        for (int i=1; i<arr.length; i++) {
//            if (arr[i-1] > arr[i]) {
//                count++;
//            }
//        }
//        // handle the case of right rotation=> To check the last and first element
//        if (arr[arr.length-1] > arr[0]) {
//            count++;
//        }
        // or ---------------
        // 3,4,5,1,2 => when i=4, it should compare with the 1st elem, so i=5=>5%5=0=>1st element
        for (int i=0; i<arr.length; i++) {
           if (arr[i] > arr[(i+1) % arr.length]) {
               count++;
           }
        }
        // if number of pair is less than 1(1 for normal cases, 0 when all the elements are equal) then true
        return count<=1;
    }
}
