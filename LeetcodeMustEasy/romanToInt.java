package LeetcodeMustEasy;
// leetcode-13
//Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//        Given a roman numeral, convert it to an integer.

import java.util.HashMap;

public class romanToInt {
    private static void Solve(String s) {
        /*
        * Traverse from end to start as we need to check the previous element for subtraction if needed
        * check char cases and assign the value to num
        * Now imagine XIV -> so 5 first and prev is 5 now for next iteration
        * next when char is I then check if I is less than V then subtract I from V and update the prev-> If one symbol is less than the symbol at its right, then it is used to subtract
        * ... and so on
        */
        int ans = 0, prev = 0, num = 0;
        for (int i=s.length()-1; i>=0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }
            // if prev becomes bigger than the current then minus current from ans
            if (num < prev) {
                ans -= num; // 5-1=4
            }else{
                ans += num; // 5, 4+10
            }
            prev = num; //5,4

        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        String s = "XIV";
        Solve(s);
        SolveMap(s);
    }

    private static void SolveMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0, prev=0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i=s.length()-1; i>=0; i--) {
            if (map.get(s.charAt(i)) < prev) {
                ans -= map.get(s.charAt(i));
            }else{
                ans += map.get(s.charAt(i));
            }
            prev = map.get(s.charAt(i));
        }
        System.out.println(ans);
    }
}
