package Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subArraysWith0Sum {
    private static void SubArrays(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        int sum=0;
        //here hm.put(0,1) means freq of sum is 1 in the `beginning..
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
//        int sum = 0;
//        int count = 0;
//        for (int i=0; i < arr.length; i++) {
//            sum += arr[i];
//            if (sum == 0) {
//                count++;
//            }
//            if (map.containsKey(sum)) {
//                count += map.get(sum);
//            }
//            map.put(sum, map.getOrDefault(sum, 0)+1);
//        }
        System.out.println(count);
    }

    private static void printSubArr(int[] arr) {
        Map<Integer, List<Integer>> subArrMap = new HashMap<>();
        int sum=0;
        int start = 0;
        int count=0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                System.out.println("start index "+ start+" end index "+ i);
                count++;
            }

            if (subArrMap.containsKey(sum)) {
                List<Integer> indexValList = subArrMap.get(sum);
                for (Integer val : indexValList) {
                    System.out.println("start index "+ (val+1)+" end index "+ i);
                    count++;
                }
            }
            // putting sum in map
            if (!subArrMap.containsKey(sum)) {
                subArrMap.put(sum, new ArrayList<>());
            }
            // adding index for every element
            subArrMap.get(sum).add(i);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 0,0,5,5,0,0 };
        SubArrays(arr);
        printSubArr(arr);
    }
}
