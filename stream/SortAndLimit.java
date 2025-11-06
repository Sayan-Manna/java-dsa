package stream;


import java.util.*;
import java.util.stream.Collectors;

// Sort the list of string alphabetically and take top 3
public class SortAndLimit {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date", "elderberry");

        List<String> top3 = words.stream()
                .sorted((a,b)->a.compareTo(b)) // natural order
                .limit(3)
                .toList();

        System.out.println(top3);


    }
}
