package Digital;

import java.util.Scanner;

// Write a program that will take one string as input. The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string. If there are two or more vowels that occur together then the program shall ignore all of those vowels.
//Input:  Compuuter
//Output: Cmpuutr
public class IgnoreConsecutiveVowel {
    static boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        if (!isVowel(s.charAt(0))) {
            res += s.charAt(0);
        }
        for (int i=1; i<s.length(); i++) {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i-1))) {
//                res += s.charAt(i-1)+""+s.charAt(i);
                // or
                res += s.charAt(i-1);
                res += s.charAt(i);
            }
            // Not else, because we want to omit single vowel
            if (!isVowel(s.charAt(i))) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
