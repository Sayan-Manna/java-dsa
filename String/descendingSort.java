package String;
import java.util.Arrays;
import java.util.Collections;
public class descendingSort {
    private static void byRev(Integer[] arr) {
        for (int i=0; i<arr.length/2; i++) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr= {1,2,3,4,5};
        // Sort in descending order
//        Arrays.sort(arr, Collections.reverseOrder());

        Arrays.sort(arr);
        byRev(arr);


    }
}
