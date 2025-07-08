package Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;

//Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false.
public class TripletSum {
    static boolean find3Numbers(int[] arr, int n, int sum) {
//        for (int i=0; i<n-2; i++) {
//            HashSet<Integer> set = new HashSet<>();
//            int curr_sum = sum - arr[i]; // number that needs to be found
//            for (int j=i+1; j < n; j++) {
//                if (set.contains(curr_sum - arr[j])) {
//                    System.out.println("Triplet is "+ arr[i] + ", " + arr[j] + ", "+ arr[curr_sum - arr[j]]);
//                    return true;
//                }
//                set.add(arr[j]);
//            }
//        }
//        return false;

        // Using Sorting and 2-pointer
        Arrays.sort(arr);
        for (int i=0; i<n-2; i++) {
            int low = i+1, high = n-1;
            while (low < high) {
                int checkSum = arr[i]+arr[low]+arr[high];
                if (checkSum == sum) {
                    System.out.println(arr[i]+","+arr[low]+","+arr[high]);
                    return true;
                }
                else if (checkSum < sum) low++;
                else high--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int n = arr.length;
        find3Numbers(arr, n, sum);
    }
}
