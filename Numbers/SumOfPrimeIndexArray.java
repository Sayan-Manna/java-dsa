package Numbers;

public class SumOfPrimeIndexArray {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i=2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8}; //prime index elem : 3,4,6,8
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
