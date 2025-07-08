package Arrays.Medium;
import java.util.HashSet;
import java.util.Set;
// Given an integer array, check if it contains a subarray having zero-sum
public class subArrayWith0SumExist {
    private static boolean hasZeroSumSubarray(int[] arr) {
        // Using HashSet : We don't need to manipulate frequency here, so hashmap not needed
        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        hs.add(0); // Add 0 first, to handle when element starts with 0 situation
        for (int i : arr) {
            sum += i;
            // if element starts with 0, sum = 0+0, set already contains 0 => return true, also add it in set
            // if 0 is not there then add the element in set and check again.....
            if (hs.contains(sum)) {
                return true;
            }
            // Add the element to set, for further checking
            hs.add(sum); // As we are checking if set contains 0, so need to pit sums in set

        }
        return false;
        // Or
//        for (int i : arr) {
//            sum += i;
//            if (sum == 0) {
//                System.out.println(hs.toString());
//                return true;
//            }
//            if (hs.contains(sum)) {
//                System.out.println(hs.toString());
//                return true;
//            }
//            hs.add(sum);
//        }
//        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 4,-6,3,1,4,2,-6 };
        System.out.println(hasZeroSumSubarray(arr) ? "Exist" : "Not");
    }
}
