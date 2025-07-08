package Digital;
//i/p: sayan5
//o/p:Yes
//i/p: sayanmanna10
//o/p: Yes
public class StrLength {
    public static void main(String[] args) {
        String s = " 1";
        String num = "";
        int len = 0;
        char[] ch = s.toCharArray();
        for (int i=0; i<ch.length; i++) {
            if (!Character.isDigit(ch[i])) {
                len++;
            }else{
                num += ch[i];
            }

        }
        if (Integer.parseInt(num) == len) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
