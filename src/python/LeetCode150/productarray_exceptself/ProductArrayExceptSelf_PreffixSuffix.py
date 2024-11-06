def productExceptSelf(self, nums):
        n = len(nums)
        prefix = [0] * n
        suffix = [0] * n
        result = [0] * n

        # Step 1: Compute the prefix products
        prefix[0] = 1  # There are no elements to the left of the first element
        for i in range(1, n):
            prefix[i] = prefix[i - 1] * nums[i - 1]

        # Step 2: Compute the suffix products
        suffix[n - 1] = 1  # There are no elements to the right of the last element
        for i in range(n - 2, -1, -1):
            suffix[i] = suffix[i + 1] * nums[i + 1]

        # Step 3: Compute the result by multiplying prefix and suffix products
        for i in range(n):
            result[i] = prefix[i] * suffix[i]

        return result


# Example usage
nums = [1, 2, 3, 4]
result = productExceptSelf(nums)
print("Product of array except self (Brute Force):", result)
