package Arrays.Medium;
// Leetcode - 2149
public class rearrangeBySign {
    private static int[] rearrange(int[] arr) {
        // Using two pointer, extra space : TC: O(n) , SC: O(n)
        int pos = 0;
        int neg = 1;
        int[] ans = new int[arr.length];
        for (int e : arr) {
            if (e >= 0) {
                ans[pos] = e;
                pos += 2;
            } else {
                ans[neg] = e;
                neg += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] res = rearrange(arr);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
