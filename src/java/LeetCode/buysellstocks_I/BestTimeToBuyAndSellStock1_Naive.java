package LeetCode.buysellstocks_I;

public class BestTimeToBuyAndSellStock1_Naive {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        // Check every possible pair of days
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Calculate the profit if buying on day i and selling on day j
                int profit = prices[j] - prices[i];
                // Update maxProfit if we found a higher profit
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit (Single Pass): " + maxProfit(prices));
    }
}