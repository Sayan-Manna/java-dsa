package String.Basics;
// Swapping Pairs of Characters in a String in Java
//Input: str = “GeeksForGeeks”
//Output: eGkeFsroeGkes
//Explanation: The given string contains odd number of characters. Therefore, we swap every pair of characters and last character remains as it is.
public class swapPairsOfChars {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        // Traverse the char[] upto n-2 and swap 1st char with 2nd char in every iteration and i+=2
        char[] ch = s.toCharArray();
        for (int i=0; i<ch.length-1; i+=2) {
            // swap
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        System.out.println(String.valueOf(ch));
    }
}
