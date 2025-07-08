package Matrix;
// Input: matrix = [
//                  [1,2,3], => 0 + n-1 = n-1
//                  [4,5,6], => 1 + n-2 = n-1
//                  [7,8,9] => 2 + n-3 = n-1
//                  ]
// secondary diagonal => row+col = N-1
public class sumOfDiagonals {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int pd = 0, sd=0;
//        for (int i=0; i<mat.length;i++) {
//            for (int j=0; j<mat[0].length; j++) {
//                // principal diag
//                if (i == j) {
//                    pd += mat[i][j];
//                }
//                if (i+j == mat.length-1) {
//                    sd += mat[i][j];
//                }
//            }
//        }
        // In one pass, we are making the row fixed
        for (int i=0; i<mat.length; i++) {
            pd += mat[i][i];
            // col = N-1-row
            sd += mat[i][mat.length-1-i];
        }
        System.out.println(pd+", "+sd);
    }
}
