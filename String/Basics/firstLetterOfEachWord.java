package String.Basics;

import java.util.Arrays;

public class firstLetterOfEachWord {
    public static void main(String[] args) {
        String s = "   hello   World Guys  ".trim();
        // regex | O(N) | O(1)
        // " " => divides by single space
        // "\\s+" => divides by every space => essentially " +"
            // The \\s represents any whitespace character (e.g., space, tab, newline), => essentially " "
            // and the + indicates one or more occurrences.
        String[] words = s.split("\\s+");
        for (String w : words) {
            System.out.print(w.substring(0,1));
        }
        // Brute-force | O(N) | O(1)
//        // a flag to detect new word(as every new world, 1st letter we need) -> traverse -> if char is not ' ' and flag is true, append the 1st letter and make flag false -> if char is ' ', make flag true so that next iteration new words starts and we can get the 1st letter
//        boolean flag = true;
//        String res = "";
//        for (int i=0; i<s.length(); i++) {
//            if (s.charAt(i) != ' ' && flag) {
//                res += s.charAt(i);
//                flag = false;
//            }else if (s.charAt(i) == ' ') {
//                flag = true;
//            }
//        }
//        System.out.println(res);
    }
}
