package Arrays;

import java.util.*;

public class findDuplicatesII {
    private static void findRepeatingElements(int[] arr) {
        // By Hashing
//        Map<Integer, Integer> mp = new HashMap<>();
//        for (int i : arr) {
//            if (mp.containsKey(i)) {
//                mp.put(i, mp.get(i) + 1);
//            }else{
//                mp.put(i, 1);
//            }
//        }
        // for each to filter out the duplicates in duplicate
//        mp.forEach((k, v) -> {
//            if (v > 1) {
//                System.out.print(k+" ");
//            }
//        });

        // By HashSet and List
        HashSet<Integer> set = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
            }else{
                if (!li.contains(i))
                    li.add(i);
            }
        }
        System.out.println(li.toString());

        // By Sorting : O(nlogn)+O(n)
//        Arrays.sort(arr);
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length - 1; i++) {
//            // condition of finding duplicates
//            if (arr[i] == arr[i+1]) {
//                if (!list.contains(arr[i])) {   // main difference
//                    list.add(arr[i]);
//                }
//            }
//        }
//        System.out.print(list+" ");

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,4,5,5,5,2,1000};
        findRepeatingElements(arr);
    }
}
