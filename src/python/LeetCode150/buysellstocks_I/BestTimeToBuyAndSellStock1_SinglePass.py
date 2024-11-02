def max_profit(prices):
    max_profit = 0
    min_price = float('inf')  # Initialize with a very large value

    for price in prices:
        if price < min_price:
            min_price = price  # Update the minimum price
        elif price - min_price > max_profit:
            max_profit = price - min_price  # Calculate and update the maximum profit

    return max_profit

# Example usage
if __name__ == "__main__":
    # Input: List of stock prices
    prices = [7, 1, 5, 3, 6, 4]
    print("Maximum Profit (Single Pass):", max_profit(prices))