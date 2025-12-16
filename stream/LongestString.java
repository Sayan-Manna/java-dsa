package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = List.of("java", "springboot", "api", "stream");
        // optional is used to handle the case when the list is empty
        Optional<String> longestStr = list.stream()
                .max(Comparator.comparingInt(s -> s.length()));
//                        .max((a,b)-> Integer.compare(a.length(), b.length())); // w/o Comparator.comparingInt

        longestStr.ifPresent(System.out::println);

        // Using reduce
        Optional<String> longest =
                list.stream()
                        .reduce((a, b) -> a.length() >= b.length() ? a : b);
        longest.ifPresent(System.out::println);


    }
}

