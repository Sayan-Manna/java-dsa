package Arrays.Medium;
import java.util.HashSet;
import java.util.Set;
// Given an integer array, find the largest subarray formed by consecutive integers.
// The subarray should contain all distinct values
//Input:  { 2, 0, 2, 1, 4, 3, 1, 0 }
//Output: The largest subarray is { 0, 2, 1, 4, 3 } // largest, also all are distinct
// // https://www.techiedelight.com/find-largest-sub-array-formed-by-consecutive-integers/
// https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/largest-subarray-with-contiguous-elements-official/ojquestion
public class longestSubArrContiguous {
    // O(n^2)
    private static void findSubArr(int[] arr) {
        int ans = 0;
        int start=0, end = 0;
        for (int i=0; i<arr.length-1; i++){
            int min = arr[i], max = arr[i];
            Set<Integer> hs = new HashSet<>();
            hs.add(arr[i]);
            for (int j=i+1; j<arr.length; j++) {
                if (hs.contains(arr[j])) {
                    break;
                }
                hs.add(arr[j]);
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                if (max-min == j-i) {
                    int length = (j-i)+1;
                    if (length > ans) {
                        ans = length;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        for (int i=start; i<=end; i++) {
            System.out.print(arr[i]+" ");
        }
//        System.out.println("("+start+"-"+end+")");
        System.out.println();
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,1};
        findSubArr(arr);
    }
}
