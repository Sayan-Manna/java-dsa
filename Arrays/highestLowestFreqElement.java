package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// FIND THE HIGHEST AND LOWEST FREQUENCY ELEMENT
public class highestLowestFreqElement {
    private static void highLowFreq(int[] arr) {
        //----- BY SORTING ------
//        int maxCount = Integer.MIN_VALUE;
//        int maxElement = arr[0];
//        int currentCount = 1; // for counting freq & comparing with max and min count
//        int minCount = Integer.MAX_VALUE;
//        int minElement = arr[0];
//        Arrays.sort(arr);
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i - 1]) {
//                currentCount++;
//            }
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                maxElement = arr[i - 1]; // store the previous element as the i might be in different element
//            }
//            if (currentCount < minCount) {
//                minCount = currentCount;
//                minElement = arr[i - 1];
//            }
//
//        }


        // ------- BY HASHING -----
        int maxCount = Integer.MIN_VALUE;
        int maxElement = -1;
        int minCount = Integer.MAX_VALUE;
        int minElement = -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
            if (minCount > entry.getValue()) {
                minCount = entry.getValue();
                minElement = entry.getKey();
            }
        }
//
        System.out.println(minElement +" : "+ minCount);
        System.out.println(maxElement+" : "+maxCount);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 }; // 5 10 10 10 20 20 20 20
        highLowFreq(arr);
    }
}
