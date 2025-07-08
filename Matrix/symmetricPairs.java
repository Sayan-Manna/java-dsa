package Matrix;

import java.util.HashMap;
import java.util.Map;

public class symmetricPairs {
    public static void main(String[] args) {
        int[][] arr = { {1, 2},
                        {2, 1},
                        {4, 5},
                        {3, 4},
                        {5, 4}
        };
        // Using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int first = arr[i][0]; // for every pair, it will get the 1st element
            int second = arr[i][1]; // for every pair, it will get the 2nd element
            if (map.get(second) != null && map.get(second) == first) {
                System.out.print("("+first + " " + second+") ");
            }
            map.put(first, second);
        }
        // Naive Approach
//        int n = 5;
//        for (int i=0; i<n; i++) {
//            for (int j=i+1; j<n; j++) {
//                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
//                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
//                    break;
//                }
//            }
//        }
    }
}