def productExceptSelf(self,nums):
    n = len(nums)
    result = [0] * n

    # Iterate over each element in the array
    for i in range(n):
        product = 1  # Initialize product for the current element

        # Calculate the product of all elements except the one at index i
        for j in range(n):
            if i != j:
                product *= nums[j]

        result[i] = product  # Store the product in the result array

    return result

# Example usage
nums = [1, 2, 3, 4]
result = productExceptSelf(nums)
print("Product of array except self (Brute Force):", result)
