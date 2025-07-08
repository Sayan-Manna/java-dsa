package Matrix;

import java.util.Arrays;
import java.util.Collections;

//[1,2,3]       [7,4,1]
//[4,5,6]  =>   [8,5,2]
//[7,8,9]       [9,6,3]
// leetcode-48
public class rotateBy90 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        // Brute-force: dummy matrix
        // Transpose + reverse numbers by each row
        for (int i=0; i<mat.length; i++) {
            // 1 will be same in normal and transpose
            for (int j=i+1; j<mat[0].length; j++){
                // swap (2 with 4 and likewise)
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length/2; j++) {
                // swap 1st element with last
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-j-1];
                mat[i][mat.length-j-1] = temp;
            }
        }

        // print
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
