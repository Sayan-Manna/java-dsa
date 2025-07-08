package Arrays;
// Leetcoe - 169
import java.util.*;

// The majority element is the element that appears more than ⌊n / 2⌋ times
public class majorityElements {
    private static void majorityElem(int[] arr) {
        // Moore's Voting Algorithm
//        the Boyer–Moore majority vote algorithm produces correct results
//        only when majority element is present in the input.
//        int count=1;
//        int majorEle = arr[0];
//        for (int i=1; i< arr.length;i++) {
//            if (arr[i] == majorEle) {
//                count++;
//            } else {
//                count--;
//            }
//            if (count == 0) {
//                majorEle = arr[i];
//                count=1;
//            }
//        }
//        System.out.println(majorEle);

        // Using Hashing
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i<arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
////        map.forEach((k,v) -> {
////            if (v > arr.length/2) {
////                System.out.println(k);
////            }
////        });
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            if (entry.getValue() > arr.length/2) {
//                System.out.println(entry.getKey());
//            }
//        }

        // Using Sorting
        Arrays.sort(arr);
        int element = -1;
        int count = 1;
        for(int i=1; i<arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                count++;
            }else {
                count = 1;
            }
            if (count > arr.length/2) {
                element = arr[i-1];
            }
        }
        System.out.println(element);
        //----------- or
        // If we know there will be a majority element for sure
        // majority element should be greater than n/2
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length/2]);

//        -----------------------
        // Naive : find the max Frequency and check if it greater than n/2
//        int maxCount = Integer.MIN_VALUE;
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] == arr[i]) {
//                    count++;
//                }
//            }
//            if (maxCount < count) {
//                maxCount = count;
//                index = i;
//            }
//        }
//        if (maxCount > arr.length / 2) {
//            System.out.println(arr[index]);
//        } else {
//            System.out.println("No");
//        }
    }
    public static void main(String[] args) {
//        int[] arr = {3,3,3};
        int[] arr = {1,2,3,2,3,3,3};
        majorityElem(arr);

    }
}
