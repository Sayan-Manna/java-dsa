package Numbers;
// Leetcode - 258 : Given a number. Repeatedly add all its digits until the result
// has only one digit left and return it.
//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2
//Since 2 has only one digit, return it
public class addDigitsRepeatedly {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));

    }
    private static int addDigits(int n) {
        // using Loops
//        int sum = 0;
//        while (n > 9) {
//            // sum of digits
//            while (n > 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//            n = sum;
//            sum = 0;
//        }

        // Without loops
        if (n == 0) return 0;
        if (n % 9 == 0)
            return 9;
        return n % 9;
    }
}
