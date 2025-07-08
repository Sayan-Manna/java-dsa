package Digital;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >=1 && n <=1000) {
            // decimal to binary
            int binary = Integer.parseInt(Integer.toBinaryString(n));
            int count = 0;
            while (binary != 0) {
                int rem = binary % 10;
                if (rem == 1) {
                    count++;
                }
                binary /= 10;
            }
            if (count % 2 == 0) {
                System.out.println("Even parity");
            }else{
                System.out.println("Odd Parity");
            }

        }else{
            System.out.println("Wrong Input");
        }

    }
}
