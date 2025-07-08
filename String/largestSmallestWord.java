package String;

public class largestSmallestWord {
    private static void findLargestSmallest(String str) {
        int maxLen=Integer.MIN_VALUE, minLen=Integer.MAX_VALUE;

        // Without using .split() | O(N) | O(1)
        // starting and ending index of each word
        int starting_index = 0, ending_index = 0;
        // two other variables are also taken as starting index need to be stored, because we can't change the
        // original starting index because it'll change the iteration
        int min_start_index=0, max_start_index=0;
        // has to be <= because for last word, we also want the ending_index to go
        while (ending_index <= str.length()) {
            // here < is taken as we are incrementing ending_index if the condition gets true
            if (ending_index < str.length() && str.charAt(ending_index) != ' ') {
                ending_index++;
            }else{
                // end of word
                // find current length of that word
                int len = ending_index-starting_index;

                if (maxLen < len) {
                    maxLen = len;
                    // store the starting index of the word where the word is largest
                    max_start_index = starting_index;
                }else if (minLen > len) {
                    minLen = len;
                    // store the starting index of the word where the word is smallest
                    min_start_index = starting_index;
                }
                ending_index++;
                // update the starting_index everytime we iterate over new word
                starting_index = ending_index;
            }
        }
        // use .substring() method
        System.out.println(str.substring(max_start_index, max_start_index+maxLen)); // largest word
        System.out.print(str.substring(min_start_index, min_start_index+minLen)); // smallest word

        // Using .split() method, O(N) | O(M) //no of words created by split()
//        String maxStr="", minStr="";
//        String[] words = str.split(" ");
//        for (String i : words) {
//            if (minLen > i.length()) {
//                minLen = i.length();
//                minStr = i; // update the value of the string
//            }else if (maxLen < i.length()) {
//                maxLen = i.length();
//                maxStr = i; // update the value of the string
//            }
//        }
//        System.out.print(minStr+" "+maxStr);
    }

    public static void main(String[] args) {
        String str = "GOD is           great";
        findLargestSmallest(str);
    }
}
