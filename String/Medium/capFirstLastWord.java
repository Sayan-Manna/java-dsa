package String.Medium;

import java.util.Arrays;

public class capFirstLastWord {
    public static void main(String[] args) {
        String s = "   Hello world of    Programming   ";
        s = s.replaceAll("\\s+"," ").trim();
        // ----------------------------------------------------------------
        // Efficient : O(N)
        char[] charArr = s.toLowerCase().toCharArray(); // make it character array in lowercase
        for (int i=0; i<charArr.length; i++) {
            if (i == 0 || i == charArr.length-1) { // if we are at 1st position || we are at last position in the
                                                   // entire array
                charArr[i] = Character.toUpperCase(charArr[i]);
            }else if (charArr[i] == ' ') { // if Space encountered, then make the prev and after space char UpperCase
                charArr[i-1] = Character.toUpperCase(charArr[i-1]);
                charArr[i+1] = Character.toUpperCase(charArr[i+1]);
            }
        }
        System.out.print(String.valueOf(charArr));
        // ----------------------------------------------------------------
        // Using .substring() method
//        String[] words = s.trim().toLowerCase().split("\\s+");
//
//        for (String word : words) {
//            if (word.length() == 1) {
//                String res = word.toUpperCase();
//            }else {
//                String Letter1 = word.substring(0, 1).toUpperCase();
//                String middle = word.substring(1, word.length() - 1);
//                String Letter2 = word.substring(word.length() - 1).toUpperCase();
//                String res = (Letter1 + middle + Letter2);
//                System.out.print(res + " ");
//            }
//        }

        // Naive : O(n^2)
//        s = s.trim() + " ";
//        s = s.toLowerCase();
//        String words = "";
//        for (int i=0; i<s.length(); i++) {
//            char ch = s.charAt(i);
//            if (Character.isWhitespace(ch)) {
//                String eachWord = "";
//                for (int j=0; j<words.length(); j++) {
//                    char ch1 = words.charAt(j);
//                    if (j == 0 || j == words.length()-1) {
//                        ch1 = Character.toUpperCase(ch1);
//                    }
//                    eachWord += ch1;
//                }
//                System.out.print(eachWord+" ");
//                words = "";
//
//            }else{
//                words += ch;
//            }
//        }
    }
}
