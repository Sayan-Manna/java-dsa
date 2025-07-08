package Numbers;
public class ExpressNumAsSumOfTwoPrimNum {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i=2; i <= Math.sqrt(num); i++) {    // i < n^(1/2) or i*i < n
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // efficient approach will be yo check if n-2 is also prime then 2+(n-2) will be the ans
    public static void main(String[] args) {
        int n = 75;
        int sum = 2;
        for (int i=3; i<=n; i+=2) {
            if (isPrime(i)) {
                sum += i;
                if (sum != n) {
                    sum = 2;
                }else{
                    System.out.println(2+" + "+ i);
                }
            }    
        }
    }
}
