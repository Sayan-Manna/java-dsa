package stream;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesPreservingOrder {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,2,4,1);

        List<Integer> result =
                nums.stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
