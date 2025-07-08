package Matrix;
// Leetcode: 2133
// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description/
//An n x n matrix is valid if **every row and every colum** contains all the integers from 1 to n (inclusive).
//return true if the matrix is valid. Otherwise, return false
// The matrix[i][j] must be [1,n]
import java.util.HashSet;
import java.util.Set;

public class checkRowColAllNum {
    private static boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        // Method1 : Bitset
        // Method2 : using add property of HashSet
        // O(n^2) | O(2n)
        // As stated in program the matrix must be [1,n]
        // In each iteration of outer for loop, we at most use 2 * n space, and their life cycles will not last more than each iteration. Therefore, in any moment the space cost is at most O(2 * n) = O(n)
        // set.add() == false => if element is already in the set
        for (int i=0; i<n; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for (int j=0; j<n; j++) {
                // set.add() == false => if element is already in the set
                if (!row.add(matrix[i][j]) || !col.add(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;

//        ------------------------------------------------------
        // Why Simple XOR solution is Wrong  ------//
//        Reason : XOR = 0 for a list of ints doesn't mean the numbers necessarily exist in pairs. e.g. 2 ^ 3 ^ 4 ^ 5 = 0
//        binary representation:
//        2 - 0010
//        3 - 0011
//        4 - 0100
//        5 - 0101
//        xor --- >0
//        -----------------
//        int allXor = 0;
//        for (int i=1; i<=n; i++) {
//            allXor ^= i;
//        }
//        for (int i=0; i<n; i++) {
//            int temp1 = allXor;
//            int temp2 = allXor;
//            for (int j=0; j<n; j++) {
//                temp1 ^= matrix[i][j];
//                temp2 ^= matrix[j][i];
//            }
//            if (temp1 != 0 || temp2!=0) return false;
//        }
//        ------------------------------------------------------
        // O(n^2) | O(n)
        // Method3 : HashSet solution with 1 pass
//        for(int i = 0 ; i < n; i ++){
//            HashSet<Integer> rows= new HashSet<Integer>();
//            HashSet<Integer> cols= new HashSet<Integer>();
//            for(int j = 0 ; j < n ; j ++){
//                rows.add(matrix[i][j]); // // only stores rows
//                cols.add(matrix[j][i]); // focus here // only stores cols // think i as j and j as i
//            }
////            as set is used only distinct nums must present, so if size != n that means there must be somme
////            duplicates that got ancelled out
//            if(rows.size() != n || cols.size() != n){
//                return false;
//            }
//        }
//        return true;
        // HashSet - 2 pass
//        for (int i=0; i<n; i++) {
//            HashSet<Integer> hs = new HashSet<Integer>();
//            for(int j = 0 ; j < n ; j++){
//                hs.add(matrix[i][j]);
//            }
//            if(hs.size() != n){
//                return false;
//            }
//        }
//        for(int i = 0 ; i < n; i ++){
//            HashSet<Integer> hs = new HashSet<Integer>();
//            for(int j = 0 ; j < n ; j++){
//                hs.add(matrix[j][i]);
//            }
//            if(hs.size() != n){
//                return false;
//            }
//        }
//        return true;
    }
    public static void main(String[] args) {
//        int[][] mat = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] mat = {{1,2,2,4,5,6,6},{2,2,4,5,6,6,1},{2,4,5,6,6,1,2},{4,5,6,6,1,2,2},{5,6,6,1,2,2,4},{6,6,1,2,2,4,5},{6,1,2,2,4,5,6}};
        System.out.println(checkValid(mat));
    }

}
