package Arrays.Medium;
//i/p: [7,1,5,3,6,4]
//o/p: 5 (buy at d2, and sell at d5)
public class BestTimeToBuySellStocks {
    static void MaxProfit(int[] arr) {
        // Optimal : DP also uses Kadane's Algo
        int buyPrice = arr[0];
        int maxProfit = 0;
        for (int i=1; i<arr.length; i++) {
            // when the buying price is minimum, it'll give maximum profit
            if (arr[i] < buyPrice) {
                buyPrice = arr[i];
            }else {
                // get the current profit
                int currProfit = arr[i] - buyPrice;
                // compare with max profit and update
                maxProfit = Math.max(currProfit, maxProfit);
            }
        }
        System.out.println(maxProfit);

        // Naive : O(n^2)
//        int profit = 0; // as -ve profit doesn't make sense
//        int max = 0;
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                profit = arr[j]-arr[i];
//                max = Math.max(profit, max);
//            }
//        }
//        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        MaxProfit(prices);
    }
}
