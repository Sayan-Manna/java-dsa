package stream;

// Given a list of numbers, square them and keep only numbers greater than 50.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareCondition {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,8,10,12);

        List<Integer> res = nums.stream()
                .map(n -> n*n)
                .filter(sq -> sq>50)
                .toList();

        System.out.println(res);
    }
}
