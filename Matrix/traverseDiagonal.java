package Matrix;

import java.util.Arrays;
//LC- 498
// Input: mat = [
                // [1,2,3],
                // [4,5,6],
                // [7,8,9]]
//Output: [1,2,4,7,5,3,6,8,9]
// Explain : ->,<-,->....this way diagonal => upper-right -> lower-left -> ...
public class traverseDiagonal {
    // Without boolean

    private static void findDiagonals(int[][] mat) {
        // using boolean : O(m*n)
        if (mat == null || mat.length == 0) return;
        int n = mat.length, m = mat[0].length;
        int row = 0, col = 0;
        int[] ans = new int[n*m];
        boolean up = true;
        int index = 0;
        while (row < n && col < m) {
            if (up) {
                while (row > 0 && col < m-1) {
                    ans[index++] = mat[row][col];
                    row--; col++;
                }
                ans[index++] = mat[row][col];
                if (col == m-1) {
                    row++;
                }else{
                    col++;
                }
            }else{
                while (row < n-1 && col > 0) {
                    ans[index++] = mat[row][col];
                    row++; col--;
                }
                ans[index++] = mat[row][col];
                if (row == n-1) {
                    col++;
                }else{
                    row++;
                }
            }
            up = !up;
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        findDiagonals(mat);
    }
}
