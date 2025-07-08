package Arrays;

import java.util.*;

// LC -1200
// Array contains distinct elements
// i/p:[4,2,1,3] o/p: (1,2),(2,3),(3,4)
public class pairWithMinAbsoluteDiff {
    private static void findPair(int[] arr) {
        // Optimized : O(nlogn)+O(n)
        Arrays.sort(arr); // 1 2 3 4
        int min = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i=1; i<arr.length;i++){
            if (Math.abs(arr[i]-arr[i-1]) < min) {
                min = Math.abs(arr[i]-arr[i-1]);
                index1 = i-1;
                index2 = i;
                res.clear();
                res.add(Arrays.asList(arr[index1],arr[index2]));
                //System.out.println("("+arr[index1]+","+arr[index2]+")"); // Use a list, clear first and then add instead of printing because we might find new pair with min diff, so the previous also prints and it's wrong
            }else if (Math.abs(arr[i]-arr[i-1]) == min) {
                index1 = i-1;
                index2 = i;
//                System.out.println("("+arr[index1]+","+arr[index2]+")");
                res.add(Arrays.asList(arr[index1],arr[index2]));
            }
        }
        System.out.println(res.toString());
    }
    public static void main(String[] args) {
        int[] A = { 4,2,1,3 };
        findPair(A);
    }
}