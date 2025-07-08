package Arrays;
import java.util.*;
// Union and intersection of two SORTED ARRAYS
//arr1[] = {1,2,3,4,5}, arr2[] = {2,3,4,4,5,6}, n = 5,m = 6.
//Output:
//{1,2,3,4,5}
//Explanation:
//Common Elements in arr1 and arr2  are:  2,3,4,5 => Intersection
//Distinct Elements in arr1 are : 1
//Distinct Elements in arr2 are : 6
//Union of arr1 and arr2 is {1,2,3,4,5,6}
public class UnionAndIntersection {
    static ArrayList<Integer> findUnion(int[] a1, int[] a2) {
        ArrayList<Integer> UnionList = new ArrayList<>();
        // Using Two-pointer (only for sorted array to get O(n+m) complexity
        // else we have to sort it manually for O((n+m)lon(m+n))
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i=0, j=0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                // or UnionList.get(UnionList.size()-1)!=a1[i]
                if (UnionList.size() == 0 || !UnionList.contains(a1[i]))
                    UnionList.add(a1[i]);
                i++;
            }
            else {
                if (UnionList.size() == 0 || !UnionList.contains(a2[j]))
                    UnionList.add(a2[j]);
                j++;
            }
        }
        while (i < a1.length) {
            if (!UnionList.contains(a1[i]))
                UnionList.add(a1[i]);
            i++;
        }
        while (j < a2.length) {
            if (!UnionList.contains(a2[j]))
                UnionList.add(a2[j]);
            j++;
        }
        // Naive O(n^2)
//        while (i<a1.length || j<a2.length) {
//            // Skip duplicates
//            while (i > 0 && i < a1.length && a1[i]==a1[i-1]) {
//                i++;
//            }
//            while (j > 0 && j < a2.length && a2[j]==a2[j-1]) {
//                j++;
//            }
//            // If one array finishes
//            if (i >= a1.length) {
//                UnionList.add(a2[j]);
//                j++;
//                continue;
//            }else if (j >= a2.length) {
//                UnionList.add(a1[i]);
//                i++;
//                continue;
//            }
//            // Comparison
//            if (a1[i] < a2[j]) {
//                UnionList.add(a1[i]);
//                i++;
//            }else if (a1[i] > a2[j]) {
//                UnionList.add(a2[j]);
//                j++;
//            }else{ // if arr1[i] == arr2[j]
//                UnionList.add(a2[j]);
//                i++;
//                j++;
//            }
//        }

        // Using HashMap (if arrays not sorted, then also it'll work)
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : a1)
//            map.put(i, map.getOrDefault(i,0)+1);
//        for (int i : a2) {
//            map.put(i, map.getOrDefault(i,0)+1);
//        }
//        // Union
//        for (int keys : map.keySet()) {
//            UnionList.add(keys);
//        }

        // HashSet (if arrays not sorted, then also it'll work)
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : a1)
//            set.add(i);
//        for (int i : a2) {
//            set.add(i);
//        }
//        UnionList.addAll(set);
        return UnionList;

    }
    static ArrayList<Integer> findInter(int[] a1, int[] a2) {

        ArrayList<Integer> Inter = new ArrayList<>();
        // Using Two-pointer (only for sorted array to get O(n+m) complexity
        // else we have to sort it manually for O((n+m)lon(m+n))
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i=0, j=0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                i++;
            }else if (a1[i] > a2[j]) {
                j++;
            }else{
                // to exclude duplicates
                if (!Inter.contains(a1[i])) {
                    Inter.add(a1[i]);
                    i++;
                    j++;
                }else{
                    i++;
                    j++;
                }
            }
        }
        return Inter;

        // Using 2 hashSets
    }
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        ArrayList<Integer> Union = findUnion(arr1, arr2);
        ArrayList<Integer> Intersection = findInter(arr1, arr2);
        for (int val: Union)
            System.out.print(val+" ");

        System.out.println();

        for (int val : Intersection)
            System.out.print(val+" ");
    }
}
