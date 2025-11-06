package stream;
import java.util.*;
import java.util.stream.Stream;
// Count how many unique numbers are present.

public class CountAndDistinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        long count = nums.stream()
                .distinct() // remove duplicates
                .count();

        Stream<Integer> lm = nums.stream().distinct();
        System.out.println(count);
        System.out.println(lm);
    }
}
