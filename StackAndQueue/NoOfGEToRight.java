package StackAndQueue;

import java.util.Arrays;

/*
* Think this problem is -> all greater elements to the right index of q
 */
/*
Input: a[] = {3, 4, 2, 7, 5, 8, 10, 6}
q = 2
index = 0,  index = 5



Output: 6, 1
Explanation: The greater elements to the right of 3(index 0) are 4,7,5,8,10,6.
The greater elements to the right of 8(index 5) are 10.
 */
public class NoOfGEToRight {
  public static void main(String[] args) {
    int[] a = { 3, 4, 2, 7, 5, 8, 10, 6 };
        int Q = 2;
        int[] queries = { 0, 5 };

        for (int i = 0; i < Q; i++) {
            System.out.println(
                noOfNextGreaterElements(a, queries[i]) + " ");
        }
  }

  private static int noOfNextGreaterElements(int[] arr, int q) {
      // TODO:
      // Optimal approach - Use Count Inversion Logic (Merge Sort)



    // Brute-force ------ O(N * Q) as Q = no of time the function will be called
    int count = 0;
    int[] nges = new int[arr.length * arr.length];
    int idx = 0;
    for (int i = q+1; i<arr.length; i++) {
      if (arr[i] > arr[q]) {
        count++;
        nges[idx++] = arr[i];
      }
    }
    System.out.println("GEs from index " + q + ": " + Arrays.toString(Arrays.copyOfRange(nges, 0, idx)));
    return count;
  }
}

