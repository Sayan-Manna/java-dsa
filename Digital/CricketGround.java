package Digital;

import java.util.Scanner;

public class CricketGround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if (r >=20 && r<=30) {
            double area = 3.14159 * r * r;
            System.out.printf("%.2f", area);
        }
        else {
            System.out.println("Wrong radius entry");
        }
    }
}
