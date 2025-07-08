package Digital;

import java.util.*;

public class WreckingBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int[] newA = new int[A.length];
        int l = 0; // index of the least value in A[]
        for (int i = 0; i < A.length; i++) {
            // find the next bigger number after L
            int nextBigger = l + 1;
            for (int j = l + 1; j < A.length; j++) {
                if (A[j] > A[l] && A[j] < A[nextBigger]) {
                    nextBigger = j;
                }
            }
            // put the next bigger number in the new array
            if (i % 2 == 0) {
                newA[l + i/2] = A[nextBigger];
            } else {
                newA[l - (i+1)/2] = A[nextBigger];
            }
            // update L
            l = nextBigger;
        }
        // print the new array
        for (int i = 0; i < newA.length; i++) {
            System.out.print(newA[i] + " ");
        }
    }
}
