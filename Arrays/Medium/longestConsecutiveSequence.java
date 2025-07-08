package Arrays.Medium;
//Input: [100, 200, 1, 3, 2, 4]
//Output: 4
//Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static boolean linearSearch(int[] arr, int x) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
    private static void findCount(int[] arr) {
        /*
        - Need to avoid sorting
        - maybe a set to avoid duplicates and store elements -> then look for x+1, x+2, ...
        - Now set is unordered so order is not fixed
        - As unordered we don't know what will be my starting sequence -> so if x-1 is found then x is not the starting element
        -
         */
        // Optimal : Set -----------------------------| O(N) | O(N) :: check analysis
        Set<Integer> set = new HashSet<>();
        int max = 1;
        if (arr.length < 1) {
            System.out.println(0);
            return;
        }
        // Add all elements to set
        for (int i : arr) {
            set.add(i);
        }
        // [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 18, 19, 22, 24, 28, 30] -> unordered
        for (int it : set) {
            // This could be my starting element to create a sequence
            if (!set.contains(it-1)) {
                int count = 1;
                // Assume 'it' is the starting element so look for it+1, it+2, it+3...
                while (set.contains(it+1)) {
                    it += 1;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
        
        // Better Approach : Sorting
        /*
        - sort the array
        - store the first element in lastSmallerElem -> every time we'll update this if lastSmallerElem+1 is present
        - if arr[i] == lastSmallerElem -> duplicates -> skip -> continue
        - if arr[i] != lastSmallerElem -> set count = 1 and lastSmallerElem = arr[i] --VVI
         */
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int max = 1;
//        int count = 1;
//        if (arr.length < 1) {
//            System.out.println(0);
//            return;
//        }
//        int lastSmallerElem = arr[0];
//        for (int i=1; i<arr.length; i++) {
//            if (arr[i] == lastSmallerElem + 1){
//                count += 1;
//                lastSmallerElem = arr[i];
//            }else if (arr[i] != lastSmallerElem) {
//                count = 1;
//                lastSmallerElem = arr[i];
//            }
//            max = Math.max(max, count);
//        }
//        System.out.println(max);

        // Brute-force O(N^2) ignoring the TC of while loop :: WC : O(n^3)
        // Iterate and store element in x and check if x+1,x+2... present, if yes count++
//        int max = 1;
//        for (int i=0; i<arr.length;i++) {
//            int x = arr[i];
//            int count = 1;
//            // As we want to search for x+1, x+2 and so on
//            // Use a while loop
//            while (linearSearch(arr, x+1) == true) {
//                x += 1;
//                count++;
//            }
//            max = Math.max(max, count);
//        }
//        System.out.println(max);
    }

    public static void main(String[] args) {
//        int[] arr = {6, 3, 14, 18, 8, 18, 4, 3,12,1,14,7,9,22,11,28,24,22,30,13,2,19,8,8,18,14,11,13,1 };
        int[] arr = {9,1,4,7,3,-1,0,5,8,-1,6};
        findCount(arr);
    }
}
