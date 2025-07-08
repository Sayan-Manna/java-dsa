package Matrix;

import java.util.Arrays;
import java.util.SortedMap;

//Each diagonal in the lower left triangle of the rectangular grid is sorted in ascending order.
//Each diagonal in the upper right triangle of the rectangular grid is sorted in descending order
// main diagonal from the top-left corner is fixed
//Input: arr[][] = {
// { 10, 2, 3 },
// { 4, 5, 6 },
// {7, 8, 9 } }
//Output:
//10 6 3
//4 5 2
//7 8 9
public class sort2DVectorDiagonally {
    private static void Sorting(int[][] mat, int row, int col, boolean ascending) {
        int r = row, c = col;
        int n = mat.length, m = mat[0].length;
        // Priority Queue
        // Using Collections.sort

        // Counting Sort
        int[] freqArr = new int[1001];
        while (r < n && c < m) {
            freqArr[mat[r][c]]++;
            r++;c++;
        }
        r = row; c = col;
        if (ascending) {
            for (int i=1; i<1001; i++) {
                if (freqArr[i] > 0) {
                    int count = freqArr[i];
                    while (count-- > 0){
                        mat[r][c] = i;
                        r++;c++;
                    }
                }
            }
        }else {
            for (int i=1000; i>=0; i--) {
                if (freqArr[i] > 0) {
                    int count = freqArr[i];
                    while (count-- > 0){
                        mat[r][c] = i;
                        r++;c++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
                {10, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = mat.length, m = mat[0].length;

        for (int j=1; j<m; j++) {
            Sorting(mat, 0, j, false);
        }
        for (int i=1; i<n; i++) {
            Sorting(mat, i, 0, true);
        }
        // print matrix
        System.out.println(Arrays.deepToString(mat));
    }
}
