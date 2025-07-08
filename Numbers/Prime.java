package Numbers;
// Check if Prime
public class Prime{
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
    // Prime Range
    static void PrimeRange(int s, int e) {
        for (int i=s; i<=e; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        
    }
    
    public static void main(String[] args) {

        // if (isPrime(29))
        //     System.out.println(" true");
        // else
        //     System.out.println(" false");

        int start = 10;
        int end = 30;
        PrimeRange(start,end);
    }
}
