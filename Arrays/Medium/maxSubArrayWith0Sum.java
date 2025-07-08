package Arrays.Medium;

import java.util.HashMap;

public class maxSubArrayWith0Sum {
    private static void maxSubArrWithZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i-map.get(sum));
            }
            else{ // else if (!map.containsKey(sum))
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        maxSubArrWithZeroSum(arr);
    }
}
