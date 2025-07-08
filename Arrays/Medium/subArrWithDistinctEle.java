package Arrays.Medium;
import java.util.*;
// https://www.techiedelight.com/print-sub-arrays-array-distinct-elements/
// Given an integer array, print all maximum size sub-arrays having all distinct elements in them.
// Input:  A[] = { 5, 2, 3, 5, 4, 3 }
//Output: The largest sub-arrays with all distinct elements are:
//{ 5, 2, 3 }
//{ 2, 3, 5, 4 }
//{ 5, 4, 3 }
public class subArrWithDistinctEle {
    private static void calculate(int[] arr) {
        // Naive : returns all distinct sub- arrays
//        int ans = 0, start=0, end=0;
//        for (int i=0; i<arr.length-1; i++) {
//            boolean[] visited = new boolean[100];
//            boolean distinct = true;
//            for (int j=i; j<arr.length; j++) {
//                if (visited[arr[j]]) {
//                    distinct = false;
//                    break;
//                }
//                start = i;
//                visited[arr[j]] = true;
//                end = j;
//            }
//            System.out.println("("+start+"-"+end+")");
//            ans++;
//        }
//        System.out.println(ans);

        // hashMap - sliding window
        int left = 0;
        int right = 0;
        Map<Integer, Integer> visited = new HashMap<>();
        while (right < arr.length) {
            if (!visited.containsKey(arr[right])) {
                visited.put(arr[right], right);
                right++;
            } else {
                System.out.println("("+left+"-"+(right-1)+")");
                left = visited.get(arr[right]) + 1;
                visited.remove(arr[right]);
            }
        }
        System.out.println("("+left+"-"+(right-1)+")");
    }

    public static void main(String[] args) {
        int[] A = { 5, 2, 3, 5, 4, 3 };
        calculate(A);
    }
}
