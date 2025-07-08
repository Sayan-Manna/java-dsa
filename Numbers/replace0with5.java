package Numbers;

public class replace0with5 {
    private static int Replace(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n%10;
            if (rem == 0) {
                rem = 5;
            }
            ans = ans * 10 + rem;
            n/=10;
        }
        // Integer.parseInt() can't be used with StringBuilder
        // because StringBuilder is a class used for building and manipulating strings, not for converting strings to other data types.
        return Integer.parseInt(String.valueOf(new StringBuilder(""+ans).reverse()));

        // By converting to String
//        String s = String.valueOf(n);
////        char[] ch = s.toCharArray();
////        for (int i=0; i<ch.length; i++) {
////            if (ch[i] == '0') {
////                ch[i] = '5';
////            }
////        }
//        for (int i=0; i<s.length();i++) {
//            if (s.charAt(i) == '0') {
//                s = s.replace('0', '5');
//            }
//        }
////        return Integer.parseInt(new String(ch));
//        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int n = 155250;
        System.out.print(Replace(n));
    }
}
