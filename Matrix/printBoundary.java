package Matrix;
// https://takeuforward.org/data-structure/matrix-boundary-traversal/
// arr = {{1,2,3,4},
//       {5,6,7,8},
//       {4,3,2,1},
//       {8,7,6,5}}
//Output:
//	1 2 3 4
//	5     8
//	4     1
//	8 7 6 5
public class printBoundary {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{4,3,2,1},{8,7,6,5}};
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (i == 0 || j==0 || i == mat.length-1 || j == mat[0].length-1) {
                    System.out.print(mat[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
