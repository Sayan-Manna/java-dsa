package Numbers;

import java.util.HashMap;
import java.util.Map;

//Given a number N, the task is to count the total number of repeating digits in the given number.
//Input: N = 996777
//Output: 2 => In the given number only 9 and 7 are repeating, hence the answer is 2
//Input: N = 1112200
//Output: 3 => In the given number 1 and 2 and 0 are repeating, hence the answer is 3
public class countRepeatingDigitsInNum {
    private static void Solution(int n) {
//        int c = 0;
//        int f = 0; // to avoid counting if a digit appears more than 2 times
//        boolean[] visited = new boolean[10];
//        while (n > 0) {
//            if (visited[n % 10] && f == 0) {
//                f = 1;
//                c++;
//            }else {
//                visited[n % 10] = true;
//                f = 0;
//            }
//            n /= 10;
//        }
        // Using Hashing
        int c = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            map.put(n%10, map.getOrDefault(n%10, 0)+1);
            n/=10;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                c++;
            }
        }
        // By converting int to String => O(n^2)
//        String a = String.valueOf(n);
//        int c = 0;
//        for(int i=0; i<a.length()-1; i++) {
//            for (int j=i+1; j<a.length(); j++) {
//                if (a.charAt(i) == a.charAt(j)) {
//                    c++;
//                }
//            }
//        }
        System.out.println(c);

    }
    public static void main(String[] args) {
        int n = 1112200;
        Solution(n);
    }
}
