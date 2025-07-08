package String;

public class maxOccurringChar {
    private static void maxOccur(String s) {
        // Using Frequency Array : O(N)/O(1)
        int maxFreq = -1;
        char ans = Character.MIN_VALUE;
        int[] freq = new int[256];
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i=0; i<256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) i;
            }
        }
        System.out.println(ans+" - "+maxFreq);
        // Using sorting : O(Nlog(N))
        // Using HashMap : O(N)/O(N)

    }

    public static void main(String[] args) {
        String s = "aaabaa";
        maxOccur(s);
    }
}
