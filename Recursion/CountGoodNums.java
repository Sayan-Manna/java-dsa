package Recursion;

public class CountGoodNums {
  private static long MOD = 1_000_000_007;

  private static int countGoodNumbers(int n) {
    long even = (n + 1) / 2;
    long odd = n / 2;
    long first = pow(5, even) % MOD;
    long second = pow(4, odd) % MOD;
    return (int) ((first * second) % MOD);
  }

  private static long pow(long x, long n) {
    if (n == 0)
      return 1;
    long half = pow(x, n / 2);

    if (n % 2 == 0) {
      return (half * half) % MOD;
    } else {
      return (x * half * half) % MOD;
    }
  }

  public static void main(String[] args) {
    int n = 2;
    System.out.println(countGoodNumbers(n));

  }
}
