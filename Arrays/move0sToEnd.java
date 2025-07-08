package Arrays;

public class move0sToEnd {
    private static void moveZero(int[] arr) {
        // Using temp[] array -------------|
        /*
        - Create a temp[] array of the same size as arr[].
        - Traverse arr[] and copy all non-zero elements to temp[].
        - fill the remaining elements of temp[] with 0.
         */
//        int[] temp = new int[arr.length];
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        for (int i = j; i <temp.length; i++) {
//            temp[i] = 0;
//        }
//        for (int i : temp)
//            System.out.print(i+" ");

        // Two-Pointer
//        int point = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[point];
//                arr[point] = temp;
//                point++;
//            }
//        }

        // or
        int fast = 0, slow = 0;
        while (fast < arr.length) {
            //if 0 is not found
            if (arr[fast] != 0) {
                // swap all the non-zero into the front of arr
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
            //continue the fast pointer.
            fast++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,3,4,0};
        moveZero(arr);
        for (int i: arr)
            System.out.print(i+" ");
    }
}
