package Matrix;
import java.util.ArrayList;
import java.util.List;
// Leetcode-54 Given an m x n matrix, return all elements of the matrix in spiral order.
// Input: matrix = [
//                  [1,2,3],
//                  [4,5,6],
//                  [7,8,9]
//                  ]
// Output: [1,2,3,6,9,8,7,4,5]
public class spiralMatrix {
    private static List<Integer> printSpiralList(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int minRow = 0, minCol = 0;
        int maxRow = matrix.length-1, maxCol = matrix[0].length-1;
        int dir = 0; // 0 to 3 if 0 left to right and so on.
        // loop until all nums are not traversed
        // Every time break switch and dir++ along with row/col ++ or -- then check the while again and do switch based on dir
        while (minRow <= maxRow && minCol <= maxCol) {
            switch(dir) {
                case 0: //RIGHT
                    for(int col = minCol; col <= maxCol; col++)
                        res.add(matrix[minRow][col]);
                    minRow++;
                    break; // breaks the switch
                case 1: //DOWN
                    for(int row = minRow; row <=maxRow; row++)
                        res.add(matrix[row][maxCol])    ;
                    maxCol--;
                    break;
                case 2://LEFT
                    for(int col = maxCol; col >= minCol; col --)
                        res.add(matrix[maxRow][col]);
                    maxRow--;
                    break;
                case 3://UP
                    for(int row = maxRow; row >= minRow; row--)
                        res.add(matrix[row][minCol]);
                    minCol++;
                    break;
            }
            dir = (dir+1)%4; // so that it never exceeds [0-3]

            // or
            // top wall | Traverse right
//            for (int i=minRow, j=minCol; j<=maxCol; j++) { // minRow fixed
//                res.add(matrix[i][j]);
//            }
//            minRow++;
//            // right wall | Traverse down
//            for (int i=minRow, j=maxCol; i<=maxRow; i++) {
//                res.add(matrix[i][j]);
//            }
//            maxCol--;
//
//            if (minRow > maxRow || minCol > maxCol) break;
//            // bottom wall / traverse left
//            for (int i = maxRow, j = maxCol; j >= minCol; j--) {
//                res.add(matrix[i][j]);
//            }
//            maxRow--;
//
//            // left wall / traverse up
//            for (int i = maxRow, j = minCol; i >= minRow; i--) {
//                    res.add(matrix[i][j]);
//            }
//            minCol++;

            // or
//            if (minRow <= maxRow) {
//                // bottom wall / traverse left
//                for (int i = maxRow, j = maxCol; j >= minCol; j--) {
//                    res.add(matrix[i][j]);
//                }
//            }
//            maxRow--;
//            if (minCol <= maxCol) {
//                // left wall / traverse up
//                for (int i = maxRow, j = minCol; i >= minRow; i--) {
//                    res.add(matrix[i][j]);
//                }
//            }
//            minCol++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = printSpiralList(matrix);
        System.out.println(res.toString());
    }
}
