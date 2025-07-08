package Numbers;
// GCD or HCF
// Euclid
public class GCD {
    // recursive
    // static int getGCD(int a, int b) {
    //     if (b == 0)
    //         return a;
    //     return getGCD(b, a % b);
    // }

    // Iterative
    static int getGCD(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(getGCD(a,b));
    }
}
