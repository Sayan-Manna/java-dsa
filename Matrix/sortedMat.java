package Matrix;

import java.util.*;
// Given an NxN matrix Mat. Sort all elements of the matrix
//Mat=[[10,20,30,40],
//[15,25,35,45]
//[27,29,37,48]
//[32,33,39,50]]
//Output:
//10 15 20 25
//27 29 30 32
//33 35 37 39
//40 45 48 50
//Explanation:
//Sorting the matrix gives this result.
public class sortedMat {
    private static void Sort(List<List<Integer>> mat, int n) {
        // Efficient: without extra space
        // O(n^2nlog(n)) | O(n^2)
        List<Integer> ans = new ArrayList<>();
        // put all elements inside ans list
        for (int i=0; i<n; i++) {
            for (int j=0;j<n;j++) {
                ans.add(mat.get(i).get(j));
            }
        }
        // Sort the ans
        Collections.sort(ans);
        // Fill the matrix again => if the question asks you to
        int index=0;
        for (int i=0; i<n;i++) {
            for (int j=0;j<n;j++) {
                mat.get(i).set(j, ans.get(index++));
            }
        }

        // print the sorted matrix
        for (List<Integer> row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> mat =
                new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(5, 4, 7)),
                new ArrayList<>(Arrays.asList(1, 3, 8)),
                new ArrayList<>(Arrays.asList(2, 9, 6))
                ));
        int n = mat.size();
        Sort(mat, n);
    }
}
