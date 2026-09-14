package stream.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStr {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sayan", "Manna", "Raj", "Neha");

        // Joined together w/o any separator
        String joined2 = names.stream()
                .collect(Collectors.joining());

        // 2. Joined with a delimiter (e.g., a comma and space)
        String joined3 = names.stream()
                .collect(Collectors.joining(", "));

        // 3. Joined with a delimiter and a prefix and suffix
        String joined4 = names.stream()
                .collect(Collectors.joining(", ", "[ ", " ]"));

        // reduce
        String joined = names.stream()
                .reduce("", (a,b) -> a + b);

        System.out.println("joined: " + joined);
        System.out.println("joined2: " + joined2);
        System.out.println("joined3: " + joined3);
        System.out.println("joined4: " + joined4);
    }
}
