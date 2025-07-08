package String.Basics;

public class generateSubstr {
    public static void main(String[] args) {
        String s = "abc";
        generateSubstrings(s);
    }

    private static void generateSubstrings(String s) {

        //Optimal : Expanding centers | O(N^2)


        // Brute-better | O(N^2) | StringBuilder
        /*
        * j should start from i as we are printing charAt(j) and adding to sb
        * for itr: a -> ab (sb append) -> abc (sb append) -> i++ -> b -> bc (sb append) -> ...
         */
//        for (int i=0; i<s.length(); i++) {
//            StringBuilder sb = new StringBuilder();
//            for (int j=i; j<s.length(); j++) {
//                sb.append(s.charAt(j));
//                System.out.println(sb.toString());
//            }
//        }


//        // Brute-force | O(N^3)
//        /*
//        * Outer loop determines the starting idx(j-1) an inner ending
//        * As i is my starting start my j with i+1 always -> if I started with j=i -> substring(0,0) -> "" so to make at-least one char
//        * s.substring(i, j) extracts the substring from index i to j-1.
//        * So j should be less or equals to the length (+1 greater in general)
//        *
//
//        */
//       for (int i=0; i<s.length(); i++) {
//           for (int j=i+1; j<=s.length(); j++) {
//               System.out.println(s.substring(i, j));
//           }
//       }

    }

}
