package Digital;

import java.util.Scanner;

public class sumOfDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt(), primDiag=0, secondDiag=0;
        int[][] mat = new int[row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        // Logic :
        // O(N)
        for (int i=0; i<row; i++) {
            primDiag += mat[i][i]; // since sum of the value of row and col are equal
            secondDiag += mat[i][row-(i+1)];
        }
        // O(row*col)
//        for (int i=0; i<row; i++) {
//            for (int j=0; j<col; j++) {
//                if (i == j) { // this condition checks for diagonals
//                    primDiag += mat[i][j];
//                }
//                // for secondary diagonal
//                if ((i+j) == (row-1)) {
//                    secondDiag += mat[i][j];
//                }
//            }
//        }

        System.out.println(primDiag+" "+secondDiag);
    }
}
