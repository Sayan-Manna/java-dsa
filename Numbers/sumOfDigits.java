package Numbers;
public class sumOfDigits {
    public static void main(String[] args) {
        int n = 145;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10; //5
            sum += rem;
            n /= 10; //14
        }
        System.out.println(sum);
    }
}
