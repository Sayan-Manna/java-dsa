package PlacementPapers;
// Raman is in possession of numbers a and b. Raman believes that number an is too little. So he made the decision to perform the number-lengthening operation a n times again.
//As long as the new number is divisible by Raman Number b,
// one procedure of lengthening a number is adding exactly one digit to the number (in decimal notation) to the right. The lengthening procedure cannot be carried out if the integer that is divisible by b cannot be found.
//Your job is to assist Raman by printing the result of number after number has been lengthened a n times.
public class Raman {
    static void NumLenthen(long a, long b, int n) {
        for (int i=0; i<n; i++) {
            boolean added  = false;
            for (int j=0; j<=9; j++) {
                long newNum = a * 10 + j;
                if (newNum % b == 0) {
                    a = newNum;
                    added = true;
                    break;
                }
            }
            if (!added) break;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        long a = 5, b = 4;
        int n = 5;
        NumLenthen(a,b,n);
    }
}


