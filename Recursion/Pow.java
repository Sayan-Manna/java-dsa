package Recursion;

public class Pow {
  public static double myPow(double x, int n) {

    // Optimnal ----- O(log|N|) time complexity and O(log|N|) space complexity
    // if (n == 0) {
    // return 1.0;
    // }
    // double half = myPow(x, n / 2);
    // if (n % 2 == 0) {
    // return half * half;
    // } else {
    // if (n > 0) {
    // return half * half * x;
    // } else {
    // return half * half / x;
    // }
    // }

    // Optimal Iterative ----- O(log|N|) time complexity and O(1) space complexity
    long exp = n;
    if (exp < 0) {
      x = 1 / x;
      exp = -exp;
    }
    double ans = 1.0;
    while (exp > 0) {
      // if exponent is odd
      if ((exp & 1) == 1) {
        ans = ans * x;
      }
      x = x * x; // square the base
      exp = exp >> 1; // divide the exponent by 2
    }
    return ans;

    // Brute-force ---- O(|N|) time complexity and O(1) space complexity
    // if (n == 0)
    // return 1.0;
    // double ans = 1.0;
    // for (int i = 0; i < Math.abs(n); i++) {
    // if (n < 0) {
    // ans = ans * (1 / x);
    // } else {
    // ans = ans * x;
    // }
    // }
    // return ans;

  }

  public static void main(String[] args) {
    double x = 2.00000;
    int n = 13;
    System.out.println(myPow(x, n));

  }
}
