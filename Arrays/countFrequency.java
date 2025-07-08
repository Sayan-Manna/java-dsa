package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    private static void countFreq(int[] arr, int n) {
        //----- BY SORTING ------ I/P order not maintained
//        Arrays.sort(arr);
//        int count = 1;
//        for (int i = 1; i < n; i++) {x
//            if (arr[i] == arr[i - 1]) {
//                count++;
//            }else{
//                System.out.println("Frequency: "+ arr[i-1] + " is "+count);
//                count = 1; // make the count 1 for counting other elements
//            }
//        }
//        System.out.println("Frequency: "+ arr[n-1] + " is "+count);

        // ------- BY HASHING -----
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i)+1);
//            }else{
//                map.put(i, 1);
//            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // For keeping the input order also not print extra elements having the same key : value pair => ***
        // Traverse the array from then check if the value of the key is -1
        // obviously none will be -1. So we will print the key and count
        // After printing we will put -1 for that specific key
        // So that if we encounter the same key again we don't print it
        // As well as maintaining the input order
        for (int i : arr) {
            if (map.get(i) != -1) {
                System.out.println(i+" "+map.get(i));
                map.put(i, -1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 }; // 5 10 10 10 20 20 20 20
        int n = arr.length;
        countFreq(arr, n);
    }
}

























