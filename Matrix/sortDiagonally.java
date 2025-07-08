package Matrix;
// LC: 1329
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class sortDiagonally {
    private static void Sorting(int[][] mat, int row, int col, int rowSize, int colSize) {
        // Optimized : Priority Queue


        // Better : Count Sort (as in the question 1 <= mat[i][j] <= 100 so smaller value thus count sort applicable
        // (m+n) * min(m, n) => mn | O(1)
        int[] values = new int[101];
        // as row and col will be incremented, the values will be changed, this causes problem so store
        int r = row, c = col;
        while (r < rowSize && c < colSize) {
            values[mat[r][c]]++;
            r++;
            c++;
        }
        // as row and col are incremented(changed), the values will be changed, this causes problem so store
        r = row;
        c = col;
        for (int i=1; i<101; i++) {
            if (values[i] > 0) {
                int count = values[i];
                while (count-- > 0) {
                    mat[r][c] = i;
                    r++;c++;
                }
            }
        }

//        // Brute-force : get the elements in diagonals and sort them
//        // (m+n) * min(m, n)log(min(m,n)) | min(m,n)
//        List<Integer> values = new ArrayList<>();
//        // as row and col will be incremented, the values will be changed, this causes problem so store
//        int r = row, c = col;
//        while (r < rowSize && c < colSize) {
//            values.add(mat[r][c]);
//            r++;
//            c++;
//        }
//        Collections.sort(values);
//        // as row and col are incremented(changed), the values will be changed, this causes problem so store
//        r = row;
//        c = col;
//        // Put sorted values on to the matrix
//        int index = 0;
//        while (r < rowSize && c < colSize) {
//            mat[r][c] = values.get(index++);
//            r++;
//            c++;
//        }
    }
    private static int[][] diagonalSort(int[][] mat) {
        // n=size of row, m = size of col
        int n = mat.length, m = mat[0].length;
        // Traverse the 0th row
        for (int j=0; j<m; j++) {
            // sorting function
            Sorting(mat, 0, j, n, m);
        }
        // Traverse from row=1 for col index 0
        for (int i=1; i<n; i++) {
            //sorting
            Sorting(mat, i, 0, n, m);
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        diagonalSort(mat);
        // print matrix
        System.out.println(Arrays.deepToString(mat));
    }

}
