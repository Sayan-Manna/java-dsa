package String;

import java.util.Arrays;
import java.util.Comparator;

public class sortStrArrAccordingToStrLen {
    private static void byComparator(String[] s) {
        // Using sort() function : O(nlog(n))
//        Arrays.sort(s, new Comparator<String>() {
//            @Override
//            public int compare(final String s1, final String s2) {
//                return (s1.length() > s2.length()) ? 1 : -1;
////                if (s1.length() > s2.length()) {
////                    return 1;
////                }else{
////                    return -1;
////                }
//
//            }
//        });
        Arrays.sort(s, (a, b) -> a.length() - b.length());
        System.out.println(String.join(" ", s));
    }

    private static void byInsertionSort(String[] s) {

    }

    public static void main(String[] args) {
        String[] s = {"Leetcode", "I", "do"};
        byInsertionSort(s);
        byComparator(s);
    }
}
