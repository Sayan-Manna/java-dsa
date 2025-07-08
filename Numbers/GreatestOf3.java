package Numbers;
public class GreatestOf3 {
    public static void main(String[] args) {
        int a = 5, b = 1, c = 10;
        // if (a > b) {
        //     if (a > c)
        //         System.out.println(a);
        //     else
        //         System.out.println(c);
        // }else{
        //     if (b > c) {
        //         System.out.println(b);
        //     }else{
        //         System.out.println(c);
        //     }
        // }
        if (a > b && a > c) {
            System.out.println(a);
        }else if (b > a && b > c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
