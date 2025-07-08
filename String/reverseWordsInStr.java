package String;
// Leetcode - 151
//follow up question: how do you handle the case:
//lets go to 'new york' -> 'new york' to go lets
public class reverseWordsInStr {
    // Without split(), trim(), StringBuilder etc.
    // Two Pointer Solution
    // https://leetcode.com/problems/reverse-words-in-a-string/solutions/47720/clean-java-two-pointers-solution-no-trim-no-split-no-stringbuilder/
    private static String reverseWOSplit(String s) {
        if (s == null) return null;
        char[] ch = s.toCharArray();
        // reverse the whole string
        reverse(ch, 0, ch.length); //
        // reverse each word
        reverseWords(ch, ch.length);
        return new String(s);

    }

    private static void reverseWords(char[] ch, int length) {

    }

    private static void reverse(char[] ch, int lb, int ub) {
        for (; lb < ub; lb++, ub--) {
            char t = ch[lb];
            ch[lb] = ch[ub];
            ch[ub] = t;
        }
    }
    private static String reverseWOSplit2(String s) {
//        int idx = s.length()-1;
//        String ans="";
//        while (idx >= 0) {
//            while (idx >= 0 && s.charAt(idx) == ' ') idx--;
//            int end = idx;
//            if (idx < 0) break;
//            while (idx >= 0 && s.charAt(idx) != ' ') idx--;
//            if (ans.isEmpty()) {
//                ans = ans.concat(s.substring(idx+1, end+1));
//            }else{
//                ans = ans.concat(" "+s.substring(idx+1, end+1));
//            }
//        }
//        return ans;
        StringBuilder ans = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') end--; // Skip spaces
            if (end < 0) break;
            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') start--;
            if (ans.length() > 0) ans.append(" ");
            ans.append(s.substring(start + 1, end + 1));
            end = start;
        }
        return ans.toString();

    }


    // Using Split(), trim()
    private static String Reverse(String s) {
        // T.C: O(n) | S.C: O(n)
        // + => one or more whitespace(s), \\s => whitespace
        // split and trimp takes O(n) time
        String[] words = s.trim().split(" "); // or ("\\s+") // O(n) space
        // Naive : Space complexity O(n)
        // Take an empty string and str += words[i]+" "; for every iteration from end

        // Using built-in Collections util
//        Collections.reverse(Arrays.asList(words));

        // TC : O(n/2)
        // - reverse the char array
        for (int i=0; i<words.length/2; i++) {
            // Swap
            String temp = words[i];
            words[i] = words[words.length-i-1];
            words[words.length-i-1] = temp;
        }
        // add spaces between each i in words[], takes O(n) time
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = "hey there String  ";
        System.out.println(Reverse(s));
//        System.out.println(reverseWOSplit(s));
        System.out.println(reverseWOSplit2(s));
    }
}
