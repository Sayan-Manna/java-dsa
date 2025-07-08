package Digital;
import java.util.Scanner;
// DP applicable
public class PalindromeSplit {
    static boolean isPal(String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) == s.charAt(s.length()-i-1)) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        String s1="", s2="", s3="";
        for (int i=0; i<s.length()-1; i++) {
            s1 = s.substring(0, i);
            if (isPal(s1)) {
                for (int j=1; j<s.length()-i; j++) {
                    s2 = s.substring(i,i+j);
                    s3 = s.substring(i+j);
                    if (isPal(s2) && isPal(s3)) {
                        System.out.println(s1+"\n"+s2+"\n"+s3);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.println("Impossible");
        }
    }
}
