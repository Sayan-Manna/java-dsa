package Numbers;
public class ArmStrongNum {
    public static void main(String[] args) {
        int x = 153;
        //int size = String.valueOf(x).length();
        int size = 0;
        int sum = 0;
        int n = x; // for the sum
//        int m = x; // for finding the size
//        while (m > 0) {
//            size++;
//            m /= 10;
//        }

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, size);
            n /= 10;
        }
        if (x == sum) {
            System.out.println("Armstrong");
        }else{
            System.out.println("not");
        }
    }
}
