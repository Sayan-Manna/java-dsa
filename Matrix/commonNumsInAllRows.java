package Matrix;
//Leetcode:1198
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// mat[4][5] = {{1, 2, 1, 4, 8},
//             {3, 7, 8, 5, 1},
//             {8, 7, 7, 3, 1},
//             {8, 1, 2, 7, 9},
//            };
//
//Output:
//1 8 or 8 1
//8 and 1 are present in all rows.
public class commonNumsInAllRows {
    private static void printCommonElements(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int smallest = Integer.MAX_VALUE;
        // Efficient: Using Map => O(nm) | O(N)
        Map<Integer, Integer> mp = new HashMap<>();
        // traverse the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // put 1st row elements with value 1 for checking other rows
                if (i == 0) {
                    mp.put(mat[0][j], 1);
                }
                // If element is present in the map and
                // is not duplicated in current row.
                if ( i> 0 && mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i) {
                    // we increment count of the element
                    // in map by 1
                    mp.put(mat[i][j], i + 1);

                    // If this is last row
                    if (i == n - 1)
                        System.out.print(mat[i][j] + ", ");
                }
            }
        }

        // Brute-force : consider every element and check if it is present in all rows. If present, then print it

    }

    public static void main(String[] args) {
         int[][] mat= {{1,2,1,4,8},{3, 7, 8, 5, 1},{8, 7, 7, 3, 1},{8, 1, 2, 7, 9}};
        printCommonElements(mat);
    }
}
