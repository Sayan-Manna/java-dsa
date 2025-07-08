package Digital;

import java.util.Scanner;
//https://www.geeksforgeeks.org/maximum-litres-of-water-that-can-be-bought-with-n-rupees/

//Approach: If we have at least n money then cost of one glass bottle is n – r3.
//This means that if r1 <= (n – r3) then we don’t need to buy glass bottles, only plastic ones, and the answer will be floor(n / r1). Other-wise we need to buy glass bottles while we can.
//
//So, if we have at least n money, then we will buy floor((n – r3) / (n – r3)) glass bottles and then spend rest of the money on plastic ones
public class AmountOfMilk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n rupees
        int r1 = sc.nextInt(); // cost of plastic bottle
        int r2 = sc.nextInt(); // cost of glass bottle
        int r3 = sc.nextInt(); // cost of empty glass bottle
        int maxLit=0;


    }
}
