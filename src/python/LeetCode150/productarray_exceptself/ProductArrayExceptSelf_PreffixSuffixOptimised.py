def productExceptSelf(self, nums):
    n = len(nums)
    result = [1] * n  # Initialize the result array with 1s

    # Step 1: Compute the prefix products and store them in the result array
    for i in range(1, n):
        result[i] = result[i - 1] * nums[i - 1]

    # Step 2: Compute the suffix products on the fly and update the result array
    suffix = 1  # Initialize suffix product to 1
    for i in range(n - 1, -1, -1):
        result[i] *= suffix # Multiply with the suffix product
        suffix *= nums[i]  # Update the suffix product

    return result


# Example usage
nums = [1, 2, 3, 4]
result = productExceptSelf(nums)
print("Product of array except self (Brute Force):", result)
