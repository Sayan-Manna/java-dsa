package Numbers;
import java.util.HashSet;
//Given a range, print all numbers having unique digits.
//Input : 10 20
//Output : 10 12 13 14 15 16 17 18 19 20  (Except 11)
public class uniqueDigitsRange {
    // O(nlog(n)) / O(1)
    private static void printUnique(int l, int r) {
        int count = 0;
        for (int i=l; i<=r; i++) {
            int num = i;
            boolean[] visited = new boolean[10];
            // find digits and maintain its hash
            while (num > 0) {
                // if digit occur more than 1 time then break
                if (visited[num % 10]) {
                    break;
                }
                visited[num % 10] = true;
                num /= 10;
            }
            // num will be 0 only when above loop doesn't get break that means the
            // number is unique so print it.

            if (num == 0) {
//                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println(count);
    }
    // Using Set and String => O(nlog(n)) / O(n)
    private static void printUniqueBySet(int l, int r) {
        int count = 0;
        for (int i=l; i<=r; i++) {
            String s = String.valueOf(i);
            // Convert String to Set
            HashSet<Integer> unique = new HashSet<>();
            for (int c : s.toCharArray()) {
                unique.add(c);
            }
            if (s.length() == unique.size()) {
//                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int l = 10, r = 15;
        printUnique(l, r);
        printUniqueBySet(l, r);
    }
}
