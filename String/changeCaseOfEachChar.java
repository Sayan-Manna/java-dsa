package String;

public class changeCaseOfEachChar {
    public static void main(String[] args) {
        String str = "hI eVeryOne";
        // Check the character's case and add the changed case to a String
        String ans="";
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                ans += Character.toUpperCase(c);
            }else {
                ans += Character.toLowerCase(c);
            }
        }
        System.out.println(ans);
    }
}
