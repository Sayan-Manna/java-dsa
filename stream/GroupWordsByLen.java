package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group words by their length.
// o.p: {3=[cat, dog, rat], 4=[lion], 5=[tiger], 8=[elephant]}
public class GroupWordsByLen {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "rat", "lion", "tiger");

        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(w -> w.length()));

        System.out.println(grouped);

    }
}
