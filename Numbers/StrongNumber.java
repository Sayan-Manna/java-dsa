package Numbers;
// When the sum of factorial of individual digits of a 
// number is equal to the original number

// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number.

public class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 145;
        int x = n;
        int sum = 0;
        while (x != 0) {
            int rem = x % 10;
            sum += factorial(rem);
            x /= 10;
        }
        // if (sum == n) {
        //     System.out.println("Strong");
        // }else{
        //     System.out.println("Not");
        // }
        String res = (sum == n) ? "Strong" : "Not";
        System.out.println(res);
    }
}
