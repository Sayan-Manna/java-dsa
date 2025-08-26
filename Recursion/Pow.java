package Recursion;

public class Pow {
  public static double myPow(double x, int n) {

    // Optimnal ----- O(log|N|) time complexity and O(1) space complexity
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
    int n = 3;
    System.out.println(myPow(x, n));

  }
}
