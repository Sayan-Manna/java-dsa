package String.Medium;
/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        int n = strs.length;

        // Using Vertical scanning
        // Time complexity: O(S), where S is the sum of all characters in all strings.

        // using indexOf and substring (Horizontal Scanning) :: O(MN), M=no of strings in array, N=size of strs[0],,, WC: O(M^2) if the 1st string is very long  ------------------------------||||
    /*
    * Not necessary to check if string is empty, because str.indexOf("") will return 0
    * Take the first word and compare it with the rest of the words
    * Use the indexOf() function to check if the prefix is there in the strs[i] or not.
        * If the prefix is there the function returns 0 else -1.
    * Use the substring function to chop the last letter from prefix each time the function return -1.


    * strs=["flower", "flow", "flight"]
    * prefix=flower
    * index=1
        while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flower")!=0)
        Since flower as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flowe"
        Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flowe")!=0)
        Since flowe as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flow"
        Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flow")!=0)
        Since flow as a whole is in flow, it returns 0 so now prefix=flow
    * index=2
        while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flow")!=0)
        Since flow as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flo"
        Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flo")!=0)
        Since flo as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "fl"
        Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("fl")!=0)
        Since fl as a whole is in flight, it returns 0 so now prefix=fl
    * index=3, for loop terminates and we return prefix which is equal to fl
     */

        String prefix = strs[0];
        for (int i=1; i<n; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                // to avoid excessive iteration - not necessary
                if (prefix.isEmpty()) {
                    System.out.println("");
                    break;
                }
            }
        }
        System.out.println(prefix);


        // using sorting -------------------------------------------||||
//        StringBuilder sb = new StringBuilder();
//        Arrays.sort(strs);
//        String prefix = strs[0];
//        String suffix = strs[n-1];
//        boolean flag = false;
//        for (int i=0; i<Math.min(prefix.length(), suffix.length()); i++) {
//            if (prefix.charAt(i) != suffix.charAt(i)) {
//                flag = true;
//                System.out.println(sb.toString());
//                break;
//            }
//            sb.append(prefix.charAt(i));
//        }
//        if (!flag) System.out.println(sb.toString());
    }
}
