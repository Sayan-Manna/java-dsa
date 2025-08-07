package StackAndQueue;

import static StackAndQueue.LargestRectangleInHistogram.largestRectangleArea;

public class MaximalRectangle {
    private static int maximalRect(char[][] mat) {
        int n = mat.length; int m = mat[0].length; int maxArea = Integer.MIN_VALUE;
        int[][] preSumMat = new int[n][m];
        for (int j=0; j<m; j++) {
            int sum = 0;
            for (int i=0; i<n; i++) {
                if (mat[i][j] == '1') {
                    sum += 1;
                } else {
                    sum = 0;
                }
                preSumMat[i][j] = sum;
            }
        }
        // Find out the area
        for (int[] row : preSumMat) {
            maxArea = Math.max(maxArea, largestRectangleArea(row));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        char[][] mat = {{'1', '0', '1', '0', '0' }, {'1', '0', '1', '1', '1' }, {'1', '1', '1', '1', '1' }, {'1', '0', '0', '1', '0' }};
        System.out.println(maximalRect(mat));
    }
}
