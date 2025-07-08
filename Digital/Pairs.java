package Digital;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//You will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.
public class Pairs {
    private static void Solution(int[] arr, int target) {
        // In this problem, the pairs might not be contiguous, that's why elements are passed to map or set first.
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
//        for (int i : arr) {
//            set.add(i);
//        }
//        for (int i : set) {
//            if (set.contains(i+target)) {
//                count++;
//            }
//        }
        int index = 0;
        for (int i : arr) {
            map.put(i, index++);
        }
        for (int i : map.keySet()) {
            if (map.containsKey(i+target)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int target = 2;
        Solution(arr,target);
    }
}
