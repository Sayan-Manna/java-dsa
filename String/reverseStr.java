package String;

public class reverseStr {
    private static String recurRev(String s) {
        // O(n^2)
        // base case
        if (s == null || s.length() <= 1) {
            return s;
        }
        return recurRev(s.substring(1))+s.charAt(0);
        // or
//        return s.charAt(s.length()-1) + recurRev(s.substring(0, s.length()-1));
        // or
        // if void
//        static void reverse(String s)
//        {
//            if ((s==null)||(s.length() <= 1))
//                System.out.println(s);
//            else
//            {
//                System.out.print(s.charAt(s.length()-1));
//                recurRev(s.substring(0,s.length()-1));
//            }
//        }

    }

    public static void main(String[] args) {
        String s = "my java";
        // Recursive
        System.out.println(recurRev(s));
    }
}
