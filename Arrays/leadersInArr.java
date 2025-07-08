package Arrays;
// Given an array A of positive Integers. Your task is to find the MVP's/leaders in the array.
// An element of array is considered MVP if it is greater than or equal to all the elements to its right side.
// The rightmost element is always a MVP
// A[] = [16,17,4,3,5,2}
//Output: 17 5 2
//Explanation:
//The first MVP is 17 as it is greater than all the elements to its right.
//Similarly, the next leader is 5. The right most element is always a leader so it is also included.
// [31 40 93 4 98 40 98] => O/P: 98, 98
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class leadersInArr {
    static List<Integer> findMVP(int n, int[] arr) {
        List<Integer> result = new ArrayList<>();
        // important
        int rightLeader = arr[n-1];
        result.add(rightLeader);
        for (int i=n-2; i>=0; i--) {
            // check if arr[i] is bigger than the current rightmost
            if (arr[i] >= rightLeader) {
                rightLeader = arr[i];
                result.add(rightLeader);
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
//        int[] A = {31,100,93,4,98,98};

        int[] A = {16,17,4,7,5,2};
        int n = A.length;
        List<Integer> mvpList = findMVP(n, A);
        for (Integer mvp : mvpList) {
            System.out.print(mvp + " ");
        }
    }
}
