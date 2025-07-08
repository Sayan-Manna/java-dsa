package BinarySearch;

public class findSqrt {
    private static int sqrt(int n) {
        // Binary Search -----------------
        int low = 1, high = n;
        while (low <= high) {
            long mid = (low + high)/2;
            long val = mid * mid;
            // condition
            if (val <= (long)n) {
                //eliminate the left half:
                low = (int)(mid + 1);
            }else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
        // Brute-force -----------------
//        int ans = 0;
//        for (long i=1; i<=n; i++) {
//            if (i*i <= (long) n) ans = (int)i;
//            else break;
//        }
//        return ans;
    }
    public static void main(String[] args) {
        int n = 35;
        System.out.println(sqrt(n));
    }
}
