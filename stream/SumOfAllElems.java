package stream;

import java.util.Arrays;
import java.util.List;

// Find the sum of all elements in a list
public class SumOfAllElems {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,8,10,12);

        Integer sumOfAllElems = nums.stream()
                .reduce(0, (a,b) -> a + b); // Start with 0 and add each

        System.out.println(sumOfAllElems);
    }
}
// 	•	reduce(initialValue, (acc, element) -> acc + element)
// Works like a for-loop accumulator.