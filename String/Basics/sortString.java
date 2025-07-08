package String.Basics;

import java.util.Arrays;

//Input string : "geeksforgeeks"
//Output string : "eeeefggkkorss"
public class sortString {
    static String sortString(String s) {
        // By Arrays.sort()
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);
        System.out.println("Output String : " + outputString);
    }
}
