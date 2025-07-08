package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
NOTE :
The decision between a [256]-sized array and a [26]-sized array depends on the requirements and constraints of your specific use case. Here are some considerations:

1. **Character Set:**
   - If you are sure that you are dealing only with English alphabets (uppercase and lowercase), a [26]-sized array is more memory-efficient and appropriate. It directly corresponds to the 26 letters of the alphabet.

   - If your input might include characters from a broader character set (e.g., extended ASCII or Unicode), you might need the [256]-sized array to cover all possibilities.

2. **Memory Usage:**
   - A [26]-sized array uses less memory compared to a [256]-sized array. If memory usage is a concern, and you're confident that you're dealing only with English alphabets, the [26]-sized array is more efficient.

3. **Flexibility:**
   - If there's a possibility that your input might change in the future to include characters outside the English alphabet, using a [256]-sized array provides more flexibility.

In most cases where you're dealing exclusively with English alphabets, a [26]-sized array is more appropriate and efficient. It's a common optimization when you know the character set is limited. However, if there's any uncertainty about the character set, it might be safer to use a [256]-sized array to cover all possibilities.

In summary, choose the array size based on the specific requirements and characteristics of your input data, balancing efficiency with flexibility.

 */

public class findDuplicates {
    public static void main(String[] args) {
        String s = "HeLlo Woorld";
        // using HashMap : O(n) => since accessing hashmap takes O(1) time, for n, it is O(n)


        // Using count[26] - counting sort
////        First step is to create an Array of size 26(because of the range a – z).
////        We are going to use the ASCII values of the characters to index the array.
////        For eg. ASCII of ‘a’ is 97, if we subtract 97 we get 0.
////        Like-wise we can store all the characters from a – z within the index range 0 – 25.
//        int[] counts = new int[26];
//        s = s.toLowerCase(); // important
//        for (int i=0; i< s.length(); i++) {
//            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                counts[s.charAt(i)-'a']++;
//            }
//        }
//        System.out.println(Arrays.toString(counts));
//        for (int i=0; i<26; i++) {
//            if (counts[i] > 1) {
//                char duplicate = (char)(i + 'a');
//                System.out.println("duplicate: "+ duplicate+ " & freq is: "+ counts[i]);
//            }
//        }

        // Using count[256] - counting sort
//        int[] counts = new int[256];
//        s = s.toLowerCase(); // important
//        for (int i=0; i<s.length(); i++) {
//            counts[s.charAt(i)]++;
//        }
//        for (int i=0; i<256; i++) {
//            if (counts[i] > 1) {
//                System.out.println((char) i + " - " + counts[i] + " times");
//            }
//        }

        // Using indexOf() : O(N)
        List<Character> li = new ArrayList<>();
//        for (int i=0; i<s.length(); i++) {
//            char c = s.charAt(i);
//            int index = s.indexOf(c, i+1);
//            if (index != -1) {
//                // if we want unique duplicates
////                if (!li.contains(s.charAt(index))) {
////                    li.add(s.charAt(index));
////                }
//                // if we want to display all duplicates
//                // we want to add the char that is equal to the index-indexed char
//                // To do that, i must not be equals to index, As the char is already printed using
//                // li.add(s.charAt(index), so we don't want that
//                // Also we need to check if it is already present or not, if present we don't want to add it again
//                if (i != index && !li.contains(c)) {
//                    li.add(c);
//                }
//                li.add(s.charAt(index));
//            }
//        }


        // Brute-force
        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<i; j++) {
                if ( s.charAt(i) == s.charAt(j)) {

                    li.add(s.charAt(j));
                }
            }
        }


        System.out.println(li);
    }
}
