package Digital;

import java.util.HashMap;
import java.util.Map;

//Input: str = "aabababa";
//Output: Second most frequent character is 'b'
public class secondFrequent {
    private static void Solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int secondMax = Integer.MIN_VALUE, max=Integer.MIN_VALUE;
        char secondMaxChar='1';
        char[] ch = s.toCharArray();
        for (int i=0; i<s.length(); i++) {
            map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }
        for (Map.Entry<Character,Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                secondMax = max;
                max = e.getValue();
            }else{
                secondMax = e.getValue();
                secondMaxChar = e.getKey();
            }
        }
        if (secondMaxChar == '\0') {
            System.out.println("None");
        }else{
            System.out.println(secondMaxChar);
        }
    }
    public static void main(String[] args) {
        String s = "abcd";
        Solution(s);
    }
}
