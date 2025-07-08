package Matrix;

import java.util.HashMap;
import java.util.Map;

public class sumAllOddFreqNum {
    private static int sumOddOccurring(int[][] mat) {
        // Hashing
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                map.put(mat[i][j], map.getOrDefault(mat[i][j], 0)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                ans += entry.getKey()*entry.getValue();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3},
                {1, 3, 2},
                {1, 5, 6}};

        System.out.println(sumOddOccurring(mat));
    }
}
