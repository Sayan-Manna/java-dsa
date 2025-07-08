package String.Medium;
// i/p: "1xyz23" | o/p: 1+23=24
// int i=5;
// String s = "1";
// String t = "2";
// System.out.println(i+s+t); => 512, if print(s+t) => 12
public class sumOfNumInStr {
    public static void main(String[] args) {
        String s = "1xyz23";
        int sum=0;
        String sumstr="0";
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sumstr += s.charAt(i);
            }else {
                sum += Integer.parseInt(sumstr);
                sumstr = "0";
            }
        }
        System.out.println(sum + Integer.parseInt(sumstr)); // for the last if string has ended
    }
}
