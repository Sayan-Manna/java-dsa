package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEvens {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> evenNums = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even nums: " + evenNums);


        // Get a simgle matching element
        Integer firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(null);
//        Optional<Integer> firstEven = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .findFirst();
        System.out.println(firstEven);

        // Get any matching element
        Optional<Integer> anyEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findAny();
        System.out.println(anyEven);





    }
}
