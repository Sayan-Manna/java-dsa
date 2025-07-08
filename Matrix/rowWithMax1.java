package Matrix;
// Given a boolean 2D array of n x m dimensions where **each row is sorted**.
// Find the 0-based index of the first row that has the maximum number of 1's.
//N = 4 , M = 4
//Arr[][] = {{0, 1, 1, 1},
//           {0, 0, 1, 1},
//           {1, 1, 1, 1},
//           {0, 0, 0, 0}}
//Output: 2
//Explanation: Row 2 contains 4 1's (0-based indexing).
public class rowWithMax1 {
    public static int lowerBound(int[] arr, int m, int x){
        int low = 0, high = m-1;
        int index = m;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (arr[mid] >= x) {
                index = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return index;
    }
    private static void rowWithMax1s(int[][] mat, int n, int m) {
        // Better : Binary Search using LowerBound
        int max = 0; // To handle -1 case
        int index = -1;
        // Traverse each row and pass each row to LowerBound
        for (int i=0; i<n; i++) {
            int countOnes = m - lowerBound(mat[i], m, 1);
            // When countOnes is 0 this block won't be executed
            if (countOnes > max) {
                max = countOnes;
                index = i;
            }
        }
        System.out.println(index);

        // Brute-force : Traverse row-wise anc count 1s // O(m*n) | O(1)
//        int max1 = 0;
//        int index = -1;
//        for (int i=0; i<n; i++) {
//            int count = 0;
//            for (int j=0; j<m; j++) {
//                if (mat[i][j] == 1) {
//                    count++;
//                }
//            }
//            if (count > max1) {
//                max1 = count;
//                index = i;
//            }
//        }
//        System.out.println(index);
    }

    public static void main(String[] args) {
        int mat[][] = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        rowWithMax1s(mat, mat.length, mat[0].length);
    }
}
