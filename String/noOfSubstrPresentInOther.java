package String;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/number-of-substrings-of-one-string-present-in-other/
//Input : s1 = aab, s2 = aaaab
//Output :6
//Substrings of s1 are ["a", "a", "b", "aa",
//"ab", "aab"]. These all are present in s2. Hence, answer is 6.
//Input :s1 = abcd, s2 = swalencud
//Output :3
public class noOfSubstrPresentInOther {
    // O(n^3) (as .contains() takes extra O(n)) | O(n)
    static int countSubstrs(String s1, String s2) {
        int ans = 0;
        // Optimized

        // Using substring() | o(N^3) | O(N)
        for (int i=0; i<s1.length(); i++) {
            for (int j=i; j<s1.length(); j++) {
                String substr = s1.substring(i, j+1);
                if (s2.contains(substr)) {
                    ans++;
                }
            }
        }
        // Brute-force | O(N^3) | O(N)
//        for (int i = 0; i < s1.length(); i++) {
//            String s3 = "";
//           for (int j=i; j<s1.length(); j++) {
//                s3 += s1.charAt(j);
//                if (s2.contains(s3)) {
//                    ans++;
//                }
//           }
//        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "aab", s2 = "aaaab";
        System.out.println(countSubstrs(s1, s2));
    }
}
