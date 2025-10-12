def maxProduct_naive(nums):
    n = len(nums)
    if n == 0:
        return 0
    max_product = float('-inf')
    for i in range(n):
        prod = 1
        for j in range(i, n):
            prod *= nums[j]
            if prod > max_product:
                max_product = prod
    return int(max_product)


# Example usage
if __name__ == "__main__":
    # Input: List of numbers
    nums = [7, 1, -5, 3, 6, -4]
    print("Maximum product sub array:", maxProduct_naive(nums))