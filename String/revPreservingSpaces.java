package String;

import java.util.Arrays;

public class revPreservingSpaces {
    public static void main(String[] args) {
        String s = "abc de";
        // Efficient: 2 pointer
        // low in 1st element, high in last element
        int low=0, high=s.length()-1;
        char[] ch = s.toCharArray();
        while (low < high) {
            if (ch[low] == ' ') {
                low++;
            }else if (ch[high] == ' ') {
                high--;
            }else {
                // Swap
                char t = ch[low];
                ch[low] = ch[high];
                ch[high] = t;
                low++;
                high--;
            }
        }
        System.out.println(String.valueOf(ch));
        // Naive : TC: O(N), SC: O(N)
        // Convert the string to character array
//        char[] inputStrArr = s.toCharArray();
//        // take new result array
//        char[] res = new char[inputStrArr.length];
//        // mark the spaces in the new array(res)
//        for (int i=0; i<inputStrArr.length; i++) {
//            if (inputStrArr[i] ==' ') {
//                res[i] = ' ';
//            }
//        }
//        // make the value of the iterator of res[], point to the last element
//        int j = res.length-1;
//        for (int i=0; i<inputStrArr.length; i++) {
//            if (inputStrArr[i] != ' ') {
//                // if the marked space in res[] occurs, then skip the j pointer
//                if (res[j] == ' ') {
//                    j--;
//                }
//                res[j] = inputStrArr[i];
//                j--;
//            }
//        }
//        System.out.println(String.valueOf(res));

    }
}
