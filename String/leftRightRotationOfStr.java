package String;

import java.util.Arrays;

public class leftRightRotationOfStr {
    private static void lefRotate(String s, int k) {
        // Using .substring() method
//        System.out.println(s.substring(k) + s.substring(0,k)); // lloWorldHe

        // Effective | O(N) | O(N)
        // The space complexity is influenced by the space required for the substrings created by substring method calls:
        //s.substring(shift) creates a substring of length O(s.length() - shift).
        //s.substring(0, shift) creates a substring of length O(shift).
        //The overall space complexity is O(s.length() - shift + shift) = O(s.length()), where s.length() is the length of the input string.

        int shift = k % s.length(); //say k is greater than s.length(), ex: 12, so to avoid error, shift=12%7=5
        System.out.println(s.substring(shift) + s.substring(0,shift));
    }

    private static void rightRotate(String s, int k) {
        // Using .substring() method
//        System.out.println(s.substring(s.length()-k)+s.substring(0, s.length()-k)); // ldHelloWor

        // Effective
        int shift = k % s.length();
        System.out.println(s.substring(s.length()-shift)+s.substring(0, s.length()-shift));
    }
    // ------------------------------------------------------------------------------------------------
    private static String leftRotation(String s, int k) {                                             //
        return s.substring(k) + s.substring(0,k); // substr(8)+substr(0,8) => result                  //
    }                                                                                                 //
    private static String rightRotateUsingLeft(String s, int k) {                                     //
        int shift = k%s.length();                                                                     //
        return leftRotation(s, s.length()-shift); // pass length-k as k                            //
    }                                                                                                 //
    // ------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        String s = "Pokemon";
        int k = 12;
        lefRotate(s, k);
        rightRotate(s, k);
        System.out.println(rightRotateUsingLeft(s, k));
    }
}
