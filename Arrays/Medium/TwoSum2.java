package Arrays.Medium;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = new TwoSum2().twoSum(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }
    // O(n)
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int low =0, high=n-1;
        while (low < high ) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low+1,high+1};
            }else if (sum > target) {
                high--;
            }else {
                low++;
            }
        }
        return new int[]{-1,-1};
    }
}
