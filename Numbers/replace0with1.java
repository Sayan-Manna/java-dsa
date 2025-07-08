package Numbers;
public class replace0with1 {
    private static int replaceZerosWithOnes(int num) {
        if (num == 0) {
            return 1;
        }
        int ans = 0, tmp = 1;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                rem = tmp;
            }
            ans = ans*10+rem;
            num/=10;
        }
        StringBuilder sb = new StringBuilder(ans+"");
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args) {
        int n = 102003;
        int result = replaceZerosWithOnes(n);
        System.out.println(result);
    }
    
}
