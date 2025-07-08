package Numbers;
public class AP {
    public static void main(String[] args) {
        int n = 4;  // Number of terms
        int d = 2;  // common diff
        int a = 2;  // first term

        // generally ap series: a, a+d, a+2d, a+3d,...
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += a;
            a += d; // for GP: a *= r;
        }
        System.out.println(sum);
    }
}
