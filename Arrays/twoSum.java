package Arrays;
// arr[] = {2,7,11,15}, target = 9
// so we have to return [0,1] => [index_of_1stElem, index_of_2ndElem]

import java.util.Arrays;
import java.util.HashMap;

// Leetcode - 1
public class twoSum {
    private static int[] Solve(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for (int i : arr) {
            int complement = target-i;
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), index++};
            }
            map.put(i, index++);
        }
        return new int[]{0,0}; // if nothing found return {0,0}


        // using nested loop
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 22;
        System.out.print(Arrays.toString(Solve(arr, target)));
    }

}
