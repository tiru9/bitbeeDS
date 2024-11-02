def max_profit_naive(prices):
    n = len(prices)
    max_profit = 0

    # Check every possible pair of days
    for i in range(n):
        for j in range(i + 1, n):
            # Calculate the profit if buying on day i and selling on day j
            profit = prices[j] - prices[i]
            # Update max_profit if we found a higher profit
            max_profit = max(max_profit, profit)

    return max_profit

# Example usage
if __name__ == "__main__":
    # Input: List of stock prices
    prices = [7, 1, 5, 3, 6, 4]
    print("Maximum Profit (Single Pass):", max_profit_naive(prices))