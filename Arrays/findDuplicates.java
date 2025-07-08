package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Leetcode => if duplicate is > 1 then this solution won't work (loop wala)
public class findDuplicates {
    static void findRepeatingElements(int[] arr) {
        // By sorting
        Arrays.sort(arr);

        System.out.print("The repeating elements are: ");
        for(int i=0;i<arr.length-1;i++)
            if(arr[i] == arr[i+1])
                System.out.print(arr[i]+" ");

        // By Hashing
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for (int i : arr) {
            // this block does the whole thing (getting and printing repeating elements)
            // So initially the map was empty, so every element will be new to map
            // therefore check if the value of the key is null, if null then elements isn't visited
            // if not null, then it's visited/duplicate, so print it
            // in case there are multiple duplicates, then...
//            if (mp.get(i) == null) {
//                mp.put(i, 1);
//            }else{
//                System.out.print(i+" ");
//            }

//            if (mp.containsKey(i)) {
//                mp.put(i, mp.get(i) + 1);
//            }else {
//                mp.put(i, 1);
//            }

            // or
//            mp.put(i, mp.getOrDefault(i,0)+1);

//        }
// ------ or
//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.print(entry.getKey()+" ");
//            }
//        }
// ----- or
//        Set<Map.Entry<Integer, Integer>> entry = mp.entrySet();
//        for(Map.Entry<Integer, Integer> ent: entry) {
//            if(ent.getValue() > 1) {
//                System.out.print(ent.getKey()+" ");
//            }
//        }

    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,2,7,8,2,3,1};
        findRepeatingElements(arr);
    }
}
