package Arrays;

public class checkIfSorted {
    static boolean isSorted(int[] arr, int n) {
        // Iterative
//        for (int i=1; i<arr.length; i++) {
//            if (arr[i] < arr[i-1]){
//                return false;
//            }
//        }
//        return true;
        // If want to use without function then : inside main use boolean var then use it

        // Recursive
        if (n == 0 || n == 1) {
            return true;
        }
        // check if the last two elements are in sorted order
        if (arr[n-1] < arr[n - 2]) {
            return false;
        }
        return isSorted(arr, n-1); // as we have checked the last one(n-1) with the last previous one(n-2) before
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,5};
        if (isSorted(arr, arr.length))
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");

    }
}
