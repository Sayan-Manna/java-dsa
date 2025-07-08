package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class freqOfEachChar {
    private static String Sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    private static void calcFreq(String s, int length) {
        // Hashing
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<length; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue()+" ");
        }
        
        // By Sorting
//        String sortedStr = Sort(s);
//        int count=1;
//        for (int i=1; i<length; i++) {
//            if (sortedStr.charAt(i) == sortedStr.charAt(i-1)) {
//                count++;
//            }else{
//                System.out.print(sortedStr.charAt(i-1)+""+count+" ");
//                count =1;
//            }
//        }
//        System.out.print(sortedStr.charAt(length-1)+""+count);
        // By sorting and taking it as an array
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//        int count = 1;
//        for (int i=1; i<ch.length; i++) {
//            if (ch[i] == ch[i-1]) {
//                 count++;
//            }else {
//                System.out.print(ch[i-1]+""+count+" ");
//                count=1;
//            }
//        }
//        System.out.print(ch[ch.length-1]+""+ count);
    }

    public static void main(String[] args) {
        String s = "God is good";
        calcFreq(s.toLowerCase(), s.length());

    }
}
