package Numbers;

public class largestPalindromeArr {
    static boolean isPal(int n) {
        int rev = 0;
        int x = n;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == n;
    }
     static int largestPal(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (isPal(arr[i])) {
                if (largest < arr[i])
                    largest = arr[i];
            }
        }
        return largest;
     }

    public static void main(String[] args) {
        int[] arr = {121, 5445, 151, 154};
        System.out.println(largestPal(arr));
    }
}
