package Matrix;

public class waveTraversal {
    private static void waveTraverse(int[][] arr) {
        // Traverse column wise
        for (int j=0; j<arr[0].length; j++) {
            // if column is even traverse downwards else upwards
            if (j % 2 == 0) {
                for (int i=0; i<arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for (int i=arr.length-1; i>=0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34}
        };
        waveTraverse(arr);
    }
}
