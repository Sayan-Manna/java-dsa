package Numbers;
// Φ (n) for an input n is the count of numbers in {1, 2, 3, …, n-1}
// that are relatively prime to n,
// i.e., the numbers whose GCD with n is 1.
// Φ(5) = 4
// gcd(1, 5) is 1, gcd(2, 5) is 1,
// gcd(3, 5) is 1 and gcd(4, 5) is 1
public class EulerTotientFunction {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    static int Phi(int n) {
        int ans = 1;
        for (int i=2; i<=n; i++) {
            if (gcd(i, n) == 1) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Phi(n));
    }
}
