package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CharFreqInStr {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Long> freq = str.chars()
                .mapToObj(ch -> (char) ch) // Converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(
                        ch -> ch, // (identity) -> group by the character itself
                        Collectors.counting() // Count occurrences in each group
                ));

        System.out.println(freq);

    }
}

/*

** str.chars()
* Returns an IntStream of the string’s UTF-16 code units.
* Each element is an int representing a char value (0 – 65535).
* Good for “normal” ASCII/most BMP characters.
* Limitation: for characters outside the BMP (like many emojis), they’re represented by surrogate pairs, so chars() will treat them as two separate values.

---

* counting() returns Long
*/
