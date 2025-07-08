package String.Basics;
// Input: s = "This is a java language"
// Output: This
//        is
//        java
//        language
public class printEvenLenWords {
    public static void main(String[] args) {
        String s = "I am Sayan REXX";
        // w/o split
//        int j= 0, index = -1;
//        for (int i=0; i<s.length(); i++) {
//            if (s.charAt(i) == ' ') {
//                if ((i-j) % 2 == 0) {
//                    System.out.println(s.substring(j, i));
//                }
//                j = i+1; // change starting position when space occurs because, next word will be after space
//            }
//            index = i; // to store the final i value
//        }
//        if (((index+1)-j)%2==0) {
//            System.out.println(s.substring(j, index + 1));
//        }

        // with split
        for (String w : s.split("\\s+")) {
            if (w.length() % 2 == 0) {
                System.out.println(w);
            }
        }
    }
}
