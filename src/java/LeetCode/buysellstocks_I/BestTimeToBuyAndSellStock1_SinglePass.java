import java.util.Arrays;

public class BestTimeToBuyAndSellStock1_SinglePass {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize the minimum price to the largest possible value
        int maxProfit = 0; // Initialize the maximum profit to 0

        // Iterate through the array
        for (int price : prices) {
            // Update minPrice if the current price is lower than minPrice
            if (price < minPrice) {
                minPrice = price;
                //System.out.println(minPrice);
            }
            // Calculate profit if we sell at the current price and update maxProfit if it's higher
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
                //System.out.println("maxProfit : "+maxProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit (Single Pass): " + maxProfit(prices));
    }
}