package Matrix;
import java.util.Arrays;
// Median in a row-wise sorted Matrix
// Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.
//R = 3, C = 3
//M = [[1, 3, 5],
//     [2, 6, 9],
//     [3, 6, 9]]
//Output: 5
//Explanation: Sorting matrix elements gives
//us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median.
public class medianInRowSortedMat {
    private static int Findmedian(int[][] arr, int row, int col) {
        // Optimized : Binary Search


        // Brute-force : store elements in array, sort them and find the middle
        int[] median = new int[row * col];
        int k = 0;
        for (int i=0; i< row; i++) {
            for (int j=0; j<col; j++) {
                median[k++] = arr[i][j];
            }
        }

        Arrays.sort(median);
        return median[(row*col)/2];
    }

    public static void main(String[] args) {
        int row = 3, col = 3;
        int[][] arr = {
                {1, 3, 8},
                {2, 3, 4},
                {1, 2, 5}};

        System.out.println(Findmedian(arr, row, col));
    }
}
