package Matrix;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Input:  arr[][]= { {‘a’, ‘b’, ‘c’, ‘d’},
//                   {‘a’, ‘e’, ‘f’, ‘r’},
//                   {‘a’, ‘b’, ‘c’, ‘d’},
//                    {‘z’, ‘c’, ‘e’, ‘f’} }
//Output: 2
//Explanation: The 2nd and the 4th row are unique.
public class countUniqueRows {
    private static int uniqueRowsCount(char mat[][]) {
        // Using HashMap : O(nm) | O(nm)
        HashMap<String, Integer> map = new HashMap();
        // Convert each row as String and putting inside map with freq
        for (int i=0; i<mat.length; i++) {
            String s = "";
            for (int j=0; j<mat[0].length; j++) {
                s += mat[i][j];
            }
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        return count;

        // Converting each row of char[] as a string and storing inside a 1D array
//        String[] strRows = new String[mat.length];
//        for (int i=0; i<mat.length; i++) {
//            strRows[i] = new String(mat[i]);
//        }
//        // Count unique from that 1-D array
//        int count = 0;
//        for (int i=0; i<strRows.length-1; i++) {
//            boolean duplicate = false;
//            for (int j=i+1; j<strRows.length; j++){
//                if (strRows[i].equals(strRows[j])) {
//                    duplicate = true;
//                    break;
//                }
//            }
//            if (!duplicate) count++;
//        }
//        return count;
    }
    public static void main(String[] args) {
        char[][] charMat = { { 'a', 'b', 'c', 'd' },
                { 'a', 'e', 'f', 'r' },
                { 'a', 'b', 'c', 'd' },
                { 'z', 'c', 'e', 'f' } };
        System.out.println("Number of unique rows: " + uniqueRowsCount(charMat));
    }
}
