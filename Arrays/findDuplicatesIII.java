package Arrays;
import java.util.ArrayList;
import java.util.List;

// Same as findDuplicates class but here it is O(n) TC with O(1) SC => Important
// Leetcode - 442
// ---------------------------------------
// i                           = ....
// abs(arr[i])                 = ....
// indexToCheck(abs(arr[i])-1) = ....
// ---------------------------------------
public class findDuplicatesIII {
    private static void findDuplicatesInArray(int[] arr) {
        // Negative Marking method
        List<Integer> li = new ArrayList<>();
        // for each i, we'll check for abs(arr[i]) and the index i.e., abs(arr[i])-1
        //        if the element in that index is in +ve, make it -ve
        //        if the element in that index is -ve, that means it's already visited, so print it
//        for (int i = 0; i < arr.length; i++) {
//            int indexToCheck = Math.abs(arr[i])-1;
//            if (arr[indexToCheck] < 0) {
//                li.add(indexToCheck+1); // or li.add(Math.abs(arr[i]));
//
//            }
//            else{
//                arr[indexToCheck] *= -1;
//            }
//        }
        // Or
        for (int i : arr) {
            int index = Math.abs(i);
            // if normal way this will throw indexOutOfbounds but here array.length=n+1
            if (arr[index] < 0) {
                li.add(index);
            }else{
                arr[index] = -arr[index];
            }
        }
        li.forEach(i -> {
            System.out.print(i+" ");
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4,3,2,7,8,2,2,3,1};
        findDuplicatesInArray(arr);
    }
}
