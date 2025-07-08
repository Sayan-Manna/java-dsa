package String.Basics;
// Input: 000012356090
//Output: 12356090
public class removeLeadingZeros {
    public static void main(String[] args) {
        // extra space
        String inp = "0001230";
        int lastzeroIndex = 0;
        String ans = "";
        for (int i=0; i<inp.length(); i++) {
            if (inp.charAt(i) == '0') {
                lastzeroIndex = i;
            }else{
                ans = inp.substring(lastzeroIndex+1);
            }
        }
        System.out.println(ans);
    }
}
