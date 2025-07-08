package Numbers;
import java.math.BigInteger;

public class FibonacciLargeNum {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(0);
        // or
        // BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int n = 6;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}
// starting from : 1 1 2 3 5 8
