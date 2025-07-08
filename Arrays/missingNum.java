package Arrays;

import java.util.HashMap;
import java.util.Map;

// Leetcode - 268 :
// Given an array containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array
public class missingNum {
    private static int findMissing(int[] arr) {
        // XOR METHOD
        int allXor = 0;
        //XOR all numbers in range [0,n]
//        for (int i=0; i<= arr.length; i++) {
//            allXor ^= i;
//        }
//        //XOR all numbers in the given array
//        for (int i : arr) {
//            allXor ^= i;
//        }
//        return allXor;
        int i=0;
        for (i=0; i<arr.length; i++) {
            allXor = allXor ^ i ^ arr[i];
        }
        System.out.println("i : "+i);
        return allXor^i;

        // With formula => Overflow may occur if array elements are large (integer overflow), that's why XOR method is used
//        int n = arr.length;
//        int sum = n*(n+1)/2;
//
//        // if Given an array of n-1 distinct integers in the range of 1 to n,
//        // eg : {1,2,3,4,5,7} it is within the range 1 to 7 but 6 or (n-1) elements present
//        // for most cases we use this solution
//        // int m = n+1; // because one num is missing
//        // int sum = m*(m+1)/2 === (n+1)*(n+1+1)/2
////        int sum = (n+1)*(n+2)/2;
//
//        for (int i=0; i<n; i++) {
//            sum -= arr[i];
//        }
//        return sum;

        // HashMap
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i], 1);
//        }
//        for(int i=1; i<=arr.length; i++){
//            if(!map.containsKey(i)){  //map.get(i) == null
//                return i;
//            }
//        }
//        return 0;
        // Naive
//        boolean flag = false;
//        for (int i=0; i<=arr.length; i++) {
////            flag = 0;
//            for (int j=0; j<arr.length; j++) {
//                if (arr[j] == i) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) return i;
//        }
//        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(findMissing(arr));
    }
}
