package Numbers;
// For 6 and 28 , the sum of their proper divisors 
// (1+2+3) and (1+4+7+14) is equal to the respective numbers

public class PerfectNum {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for (int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect");
        }else{
            System.out.println("no");
        }
    }
}
