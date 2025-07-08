package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class countSubArrGivenXor {
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int cnt = 0;

        // Optimal : Hashing
        Map<Integer, Integer> map = new HashMap<>();
        int allXor = 0;
        map.put(allXor, 1);
        for (int i=0; i<a.length; i++) {
            allXor ^= a[i];
            int x = allXor^k;
            if (map.containsKey(x)) {
                cnt += map.get(x);
            }
            map.put(allXor, map.getOrDefault(allXor, 0)+1);
        }

        // Better O(n^2)
//        for (int i=0; i<a.length; i++) {
//            int xorr = 0;
//            for (int j=i; j<a.length; j++) {
//                xorr ^= a[j];
//                if (xorr == k) {
//                    System.out.println(i + "," + j);
//                    cnt++;
//                }
//            }
//
//        }
        // Brute-force O(n^3)
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                //step 2:calculate XOR of all
//                // elements:
//                int xorr = 0;
//                for (int K = i; K <= j; K++) {
//                    xorr = xorr ^ a[K];
//                }
//
//                // step 3:check XOR and count:
//                if (xorr == k) {
//                    System.out.println(i + "," + j);
//                    cnt++;
//                }
//
//            }
//        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
