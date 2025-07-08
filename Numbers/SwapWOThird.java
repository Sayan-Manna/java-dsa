package Numbers;
public class SwapWOThird {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b; // a=30
        b = a - b; // b = 30 - 20 = 10
        a = a - b; // a = 30 - 10 = 20
        // + or * and - or /
        // a = a ^ b;
        //b = b ^ a;
        //a = a ^ b;
        System.out.println(a+" "+b);
    }
}
