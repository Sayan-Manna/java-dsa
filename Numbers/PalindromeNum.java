package Numbers;
public class PalindromeNum {
    // public static void main(String[] args) {
    //     int n = 740;
    //     int rev = 0;
    //     int x = n; // This is important
    //     while (x > 0) {
    //         rev = rev * 10 + x % 10;
    //         x /= 10;
    //     }
    //     if (rev == n) {
    //         System.out.println("Palindrome");
    //     }else{
    //         System.out.println("Not");
    //     }
    

    // }

    // Palindrome Range
    static boolean isPal(int n, int rev) {
        int x = n;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev == n) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int start = 100, end = 200;
        int rev = 0;
        for (int i = start; i <= end; i++) {
            if (isPal(i, rev)) {
                System.out.print(i+" ");
            }
        }
    }
}
