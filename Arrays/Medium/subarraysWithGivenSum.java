package Arrays.Medium;
// Leetcode - 560
// https://leetcode.com/problems/subarray-sum-equals-k/solutions/182327/follow-up-print-all-subarrays/
import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//nums[] = { 3, 4, -7, 1, 3, 3, 1, -4 }, target = 7
//Output: 4
//{ 3, 4 }
//{ 3, 4, -7, 1, 3, 3 }
//{ 1, 3, 3 }
//{ 3, 3, 1 }
public class subarraysWithGivenSum {
    // Utility function to print subarray `nums[i, j]`
    public static void print(int[] arr, int i, int j) {
        System.out.println(IntStream.range(i, j + 1)
                .mapToObj(k -> arr[k])
                .collect(Collectors.toList()));
    }
    private static void allSubArraysGivenSum(int[] arr, int k) {
        // Efficient : Hashing using Prefix sum
//        Map<Integer, Integer> map = new HashMap<>();
//        // Initially, put key(sum) as 0 and value as 1
//        map.put(0, 1);
//        int sum = 0;
//        int count = 0; // To get the number of sub-arrays
//        for (int i=0; i<arr.length; i++) {
//            sum += arr[i];
//            if (map.containsKey(sum - k)) {
//                // Number of sub-arrays
//                // count the values of (sum-k) => 1+2+1
//                count += map.get(sum-k);
//            }
//
//            // Update Frequency
//            map.put(sum, map.getOrDefault(sum,0)+1);
//        }
//        System.out.println(count);
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> index = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        // Initially, put key (sum) as 0 and value as 1
//        map.put(0, 1);
//        index.put(0,-1);
        int sum = 0;
        int count = 0; // To get the number of sub-arrays

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                list.clear();
                count++;
                for (int j=0; j<=i; j++) {
                    list.add(arr[j]);
                }
                System.out.println(list);
                list.clear();
            }

            if (map.containsKey(sum - k)) {
//                List<Integer> answer = new ArrayList<Integer>();
                // Number of sub-arrays
                // Count the values of (sum - k)
                count += map.get(sum - k);

                int indexNumber = index.get(sum - k) + 1; // get the start of the subarray by tracking it down from the hashmap

                // Print subarrays
                while (indexNumber <= i) {
                    list.add(arr[indexNumber]);
                    indexNumber++;
                }
                System.out.println(list);
                list.clear();
//                res.add(answer);
            }

            // Update Frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            index.put(sum, i);
        }
//        System.out.println(list);
        System.out.println("Total count: " + count);

        // Naive Approach : O(n^3), n^3 for printing the sub-arrays
//        int count = 0; // Also to count number of sub-arrays
//        for (int i=0; i<arr.length; i++) {
//            int sum_so_far = 0; // Initialized inside loop to make it zero to count other sub-arrays
//            for (int j=i; j<arr.length; j++) {
//                sum_so_far += arr[j];
//                if (sum_so_far == k) {
//                    count++;
//                    System.out.println("In between " + i + " and " + j); // to print the indexes in between
////                    print(arr, i, j);
//                    // Alternate way to print the sub-arrays
////                    for (int l=i; l <=j; l++) {
////                        System.out.print(arr[l]+" ");
////                    }
////                    System.out.println();
//                }
//            }
//        }
//        System.out.println(count);

    }
    private static void printSubArr(int[] arr, int target) {
        Map<Integer, List<Integer>> subArrMap = new HashMap<>();
        int sum=0;
        int start = 0;
        int count=0;
        subArrMap.put(sum, new ArrayList<>());
        subArrMap.get(sum).add(-1);
        List<List<Integer>> res= new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if (subArrMap.containsKey(sum-target)) {
                List<Integer> indexValList = subArrMap.get(sum - target);
                for (int val : indexValList) {
                    System.out.println((val+1)+","+i);
                    List<Integer> list = new ArrayList<>();
//                    for (int j = val+1; j<=i; j++)
//                        list.add(arr[j]);
                    count++;
                    res.add(list);
                }
            }
            subArrMap.putIfAbsent(sum, new ArrayList<>());
            subArrMap.get(sum).add(i);
        }
        System.out.println(res);
        System.out.println(count);

//        for (int i=0; i<arr.length; i++) {
//            sum += arr[i];
//            if (sum == target) {
////                System.out.println("start index "+ start+" end index "+ i);
//                for (int j=0; j<=i; j++) {
//                    System.out.print(arr[j]+",");
//                }
//                System.out.println();
//                count++;
//
//            }
//
//            if (subArrMap.containsKey(sum-target)) {
//                List<Integer> indexValList = subArrMap.get(sum-target);
////                System.out.println(indexValList);
////                for (Integer val : indexValList) {
////                    System.out.println("start index "+ (val+1)+" end index "+ i);
////                    count++;
////                }
//                for (int val : indexValList) {
//                    for (int j=val+1; j<=i; j++) {
//                        System.out.print(arr[j]+",");
//                    }
//                    count++;
//                    System.out.println();
//                }
//
//            }
//            // putting sum in map
////            if (!subArrMap.containsKey(sum)) {
////                subArrMap.put(sum, new ArrayList<>());
////            }
//            subArrMap.putIfAbsent(sum, new ArrayList<>());
//            // adding index for every element
//            subArrMap.get(sum).add(i);
//        }
//        System.out.println(count);
////        System.out.println(subArrMap.toString());
    }
    static void printSub(int[] arr, int k) {
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k) {
                count++;
            }
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 1, 3,3};
        int target = 7;
//        int[] arr = {0,0,0,0,0,0,0};
//        int target = 0;
//        allSubArraysGivenSum(arr, target);
        printSubArr(arr, target);
//        printSub(arr,target);
    }

}
