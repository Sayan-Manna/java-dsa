package Matrix;
import java.util.Arrays;
//Input: arr[][] = { {3, 2, 5, 6}, {1, 2, 3}, {6, 3}, {5, 4, 2} }
//Output: { {1, 2, 3}, {2, 3, 5, 6}, {2, 4, 5}, {3, 6} }
// [2,3,5,6],[1,2,3],[3,6],[2,4,5] => sort row-wise
// [1,2,3],[2,3,5,6],[2,4,5],[3,6] => sort the sorted rows => o/p
public class sortLexicographically {
    private static void sort_lexicographically(int[][] arr) {
        // sort row-wise
        for (int i=0; i<arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        // Sort whole array in lexicographically
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 2, 5, 6 }, { 1, 2, 3 }, { 6, 3 }, { 9, 99 },{ 6, 3, 2 }, { 5, 4, 2 } };
        sort_lexicographically(arr);

        // Resultant 2-d array after
        // sorting lexicographically
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
