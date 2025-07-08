package Matrix;

// Given an m x n matrix mat where every row is **sorted in strictly increasing order**,
// return the smallest common element in all rows. If there is no common element, return -1.
// No duplicates in each row, sorted
// 1 <= mat[i][j] <= 10^4, m=row, n = col
public class smallestCommonInAllRows {
    private static int smallestCommon(int[][] mat) {
        // Binary Search

        // ----------------------------
        // Improved counting: 1 pass
        int m = mat.length;
        int n = mat[0].length;
        int[] count = new int[10001];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                // as sorted, the 1st number hitting the same row number mark is the smallest, so return drectly
                if (++count[mat[i][j]] == m) {
                    return mat[i][j];
                }
            }
        }
        return -1;
        // ------------------------
        // Using count sort : O(nm) | O(max(m,n))
//        int m = mat.length;
//        int n = mat[0].length;
//        int[] count = new int[10001];
//        for (int i=0; i<m; i++) {
//            for (int j=0; j<n; j++) {
//                count[mat[i][j]]++;
//            }
//        }
//        for (int k=1; k<=10000; k++) {
//            if (count[k] == m) {
//                return k;
//            }
//        }
//        return -1;
        // ------------------------
        // Using map : 1 pass => if duplicates there, still also work
//        int m = mat.length;
//        int n = mat[0].length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i<m; i++) {
//            for (int j=0; j<n; j++) {
//                if (i == 0) {
//                    map.put(mat[0][j], 1);
//                }else if (map.get(mat[i][j]) != null && map.get(mat[i][j]) == i) {
//                    map.put(mat[i][j], i+1);
//                }
//                if (map.get(mat[i][j])!=null && map.get(mat[i][j]) == m) {
//                    return mat[i][j];
//                }
//            }
//        }
//        return -1;
        // ------------------------
        // Using map => 1 pass
//        int m = mat.length;
//        int n = mat[0].length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i<m; i++) {
//            for (int j=0;j<n; j++) {
//                int current = mat[i][j];
//                map.put(current, map.getOrDefault(current,0)+1);
//                if (map.get(current) == m) {
//                    return current;
//                }
//            }
//        }
//        return -1;
        // ------------------------
        // Using Map = 2 pass => O(nm) | O(N)
        // Store the freq of all numbers in map
        // as the rows sorted, keys in map will be in sorted order as well
//        int m = mat.length;
//        int n = mat[0].length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                int current = mat[i][j];
////                if (map.get(current) == null) {
////                    map.put(current, 1);
////                } else {
////                    map.put(current, map.get(current) + 1);
////                }
//                map.put(current, map.getOrDefault(current,0)+1);
//            }
//        }
//        // Take out the 1st key whose value == row size
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == m) {
//                return entry.getKey();
//            }
//        }
//        return -1;
    }
    public static void main(String[] args) {
        int[][] mat= {{1,2,3,4,5},{2,4,5,8,10},{3,5,7,9,11},{1,3,5,7,9}};
        System.out.println(smallestCommon(mat));;
    }
}
