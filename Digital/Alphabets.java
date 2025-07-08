package Digital;

public class Alphabets {
    public static void main(String[] args) {
        String s = "HOLLYWOOD";
        int ans = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'D' || s.charAt(i) == 'O' || s.charAt(i) == 'P' || s.charAt(i)=='Q' || s.charAt(i)=='R') {
                ans += 1;
            }else if(s.charAt(i)=='B') {
                ans += 2;
            }
        }
        System.out.println(ans);
    }
}
