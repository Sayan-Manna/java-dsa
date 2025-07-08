package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class missingAndRepeatingNum {
    static void missingRepeating(int[] arr) {
        // Using Negation
        // Use the abs value-1 as index and mark -ve to the visited vals
        // if already -ve => Repeating
        List<Integer> repeating = new ArrayList<>();
        for (int i : arr) {
            int absVal = Math.abs(i);
            if (arr[absVal-1] > 0) {
                arr[absVal-1] = -arr[absVal-1];
            }else{
                repeating.add(absVal);
            }
        }
        System.out.println("repeating : "+ repeating.toString());
        // Missing
        // Traverse again, if found +ve in the range [o,n-1] then => missing (ps:that's why for each loop not used here)
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                missing.add(i + 1);
        }
        System.out.print("Misssing: "+ missing.toString());

        // HASH MAP
//        Map<Integer, Boolean> map = new HashMap<>();
//        for (int i : arr) {
//            if (map.get(i) == null) {
//                map.put(i, true);
//            }else{
//                System.out.println("repeating: "+i);
//            }
//        }
//        for (int i = 1; i <= arr.length; i++) {
//            if (map.get(i) == null) {
//                System.out.println("missing: "+i);
//            }
//        }

        // using Maths
//        int n = arr.length;
//        int s = (n * (n+1) ) /2;
//        int s2 = (n * (n +1) *(2*n +1) )/6;
//        int missing = 0;
//        int repeating = 0;
//        for (int i=0; i<n; i++) {
//            s = s - arr[i];
//            s2 = s2 - arr[i]*arr[i];
//        }
//        missing = (s+(s2/s))/2;
//        repeating = missing - s;
//        System.out.println(missing +" "+repeating);

        // XOR method + Set Bits

    }
    public static void main(String[] args) {
        int[] arr = {4,3,3,6,2,2,1};
        missingRepeating(arr);
    }
}
