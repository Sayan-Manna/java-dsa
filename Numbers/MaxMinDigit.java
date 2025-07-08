package Numbers;
public class MaxMinDigit {
    public static void main(String[] args) {
        int n = 2783;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while (n > 0) {
            int rem = n % 10;
            if (max < rem) {
                max = rem;
            }
            if (min > rem){
                min = rem;
            }
            n /= 10;
        }
        System.out.println(max+" "+min);
    }
}
