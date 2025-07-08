package Arrays;
// Given an unsorted integer array, print all pairs with a given difference k in it.
// No duplicates present
// https://www.techiedelight.com/find-pairs-with-given-difference-array/
import java.util.*;

public class pairsWithDifferenceK {
    // HashMap - 1 pass
//    private static void findPair(int[] arr, int k) {
//        if (k<0) return;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : arr) {
//            if (map.containsKey(i)) {
//                continue;
//            }
//            if (map.containsKey(i+k)) {
//                System.out.println("(" + (i + k) + ", " + i + ")");
//            }
//            if (map.containsKey(i-k)) {
//                System.out.println("(" + i + ", " + (i - k) + ")");
//            }
//            map.putIfAbsent(i,i);
//
//        }
//        System.out.println(map.toString());
//    }
    // Set - 1 Pass
//    private static void findPair(int[] arr, int k) {
//        if (k<0) return;
//        Set<Integer> nums = new HashSet<>();
//        Set<Integer> found = new HashSet<>();
//        for (int i : arr) {
////            if (nums.contains(i)) {
////                continue;
////            }
//            if (nums.contains(i+k)) {
////                System.out.println("(" + (i + k) + ", " + i + ")");
//                found.add(i);
//            }
//            if (nums.contains(i-k)) {
////                System.out.println("(" + i + ", " + (i - k) + ")");
//                found.add(i - k);
//            }
//            nums.add(i);
//        }
//        System.out.println(found.size());
//    }
    // Hashing - 2 Passes
    private static void findPair(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for (int i : map.keySet()) {
            if ( k>0 && map.containsKey(k+i)) {
                System.out.println("( " + Math.abs(k + i) + ", " + i + " )");
            }
        }
    }
    // Sorting + Two Pointer : O(nlogn)
// The function assumes that the array is sorted
//    static boolean findPair(int arr[],int n) {
//        int size = arr.length;
//        int i = 0, j = 1;
//        while (i < size && j < size) {
//            if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n)) {
//                System.out.print("Pair Found: "+ "( "+arr[i]+", "+ arr[j]+" )");
//                return true;
//            }
//            else if (arr[j] - arr[i] < n)
//                j++;
//            else
//                i++;
//        }
//        System.out.print("No such pair");
//        return false;
//    }

    // Naive : O(nlogn) -to remove duplicates + O(n^2)
    // This function will return the array length upto the non-duplicated part
//     private static int getNotDuplicatedLength(int[] arr) {
//        Arrays.sort(arr);
//        int i = 0;
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[j] != arr[i]) {
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i+1;
//    }
//    private static void findPair(int[] arr, int k) {
////        int size = getNotDuplicatedLength(arr);
//        int size = arr.length;
//        Set<String> set = new HashSet<>();
//        for (int l=0; l<size-1; l++) {
//            for (int j=l+1; j<size; j++) {
//                if (arr[j]-arr[l] == k || arr[l]-arr[j] == k) {
//
//                    System.out.printf("(%d, %d) ", arr[l], arr[j]);
//                }
//                set.add(arr[])
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int k = 1;
        findPair(arr, k);
    }
}
