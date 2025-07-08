package Matrix;
// https://practice.geeksforgeeks.org/problems/count-number-of-free-cell--170646/1
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class noOfFreeCells {
    private static void countNumberofFreeCell(int[][] arr, int N, int K) {
        long freeCells = N*N;
        boolean[] filledRows = new boolean[N];
        boolean[] filledCols = new boolean[N];
        int rowCount = 0 , colCount = 0;
        long[] ans = new long[K];
        for(int i = 0 ; i < K ; i++){
            int row = arr[i][0];
            int col = arr[i][1];
            //if it is a new row to be filled
            if(!filledRows[row-1]){
                freeCells -= (N-colCount);
                filledRows[row-1] = true;
                rowCount++;
            }
            //if it is a new col to be filled
            if(!filledCols[col-1]){
                freeCells -= (N-rowCount);
                filledCols[col-1] = true;
                colCount++;
            }
            //remaining freeCells after filling row and col
            ans[i] = freeCells;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int n, k;
        n = 3;
        k = 3;

        // Initialize the arr vector
        // which contains the row number
        // and column number
        int[][] arr = { { 1, 1 }, { 1, 2 }, { 2, 1 } };

        // Function call
        countNumberofFreeCell(arr, n, k);
    }
}
