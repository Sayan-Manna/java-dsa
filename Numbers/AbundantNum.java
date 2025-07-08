package Numbers;
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, 
// Since 21 is greater than 18, 18 is an abundant number

public class AbundantNum {
    public static void main(String[] args) {
        int n = 18;
        int sum = 0;
        for (int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println((sum > n) ? "Abundant" : "No");
        
    }
}
