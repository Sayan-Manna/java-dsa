package Numbers;
public class LeapYr {
    public static void main(String[] args) {
        int year = 2010;
        // if (year % 400 == 0) {
        //     System.out.println("Leap Yr");
        // }else if(year % 100 == 0) {
        //     System.out.println("Not");
        // }else if (year % 4 == 0) {
        //     System.out.println("Leap Yr");
        // }else{
        //     System.out.println("Not");
        // }
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
