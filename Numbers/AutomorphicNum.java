package Numbers;
// A number is called an Automorphic number if and only if 
// its square ends in the same digits as the number itself.
// Input Format: N = 76
// Result: Automorphic Number
// Calculating 76 * 76 gives 5776, it ends with the given number.

public class AutomorphicNum {
    static boolean isAutomorphic(int n) {
        long sq = n*n;
        while (n > 0) {
            if (n % 10 != sq % 10) {
               return false;
            }else{
                n /= 10;
                sq /= 10; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 376;
        if(isAutomorphic(n)==true)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}
