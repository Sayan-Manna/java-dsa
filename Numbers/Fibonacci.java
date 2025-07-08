package Numbers;
public class Fibonacci {
    // Recursive
    static int NthFib(int n) {
        if (n == 0 || n == 1)
            return n;
        return NthFib(n-1)+NthFib(n-2);
    }
    public static void main(String[] args) {
        // Fibonacci Series upto N terms
        int n = 14;
        int a = 0;
        int b = 1;
        //System.out.print(a+" "+b+" ");
        for (int i=2; i<=n; i++) {
            int temp = b + a;
            //System.out.print(temp+" ");
            a = b;
            b = temp;
        }
        System.out.println(b); // Nth Fibonacci

        // Nth Fibonacci
        // int n = 14;
        // System.out.println(NthFib(n));
    }
}
