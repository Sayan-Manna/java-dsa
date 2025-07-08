package Matrix;
// Trace => sum of principal diagonal
// Normal => Math.sqrt(sum of squares of each numbers row wise)
// Input: matrix = [
//                  [1,2,3],
//                  [4,5,6],
//                  [7,8,9]
//                  ]
// Trace: 1+5+9
// Normal: sqrt(1*1+2*2+3*3+4*4+...)
public class traceAndNormal {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int trace = 0;
        // Trace
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (i == j) {
                    trace += mat[i][j];
                }
            }
        }
        System.out.println(trace);
        // Normal
        int normal = 0, sum = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                sum += Math.pow(mat[i][j], 2);
            }
        }

        normal = (int) Math.sqrt(sum);
        System.out.println(normal);
    }
}
