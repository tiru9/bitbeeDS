def subarray_sum_prefix_sum(nums, k):
    count = 0
    prefix_sum = [0] * (len(nums) + 1)
    
    # Build the prefix sum array
    for i in range(1, len(nums) + 1):
        prefix_sum[i] = prefix_sum[i - 1] + nums[i - 1]
    
    # Check all subarrays
    for start in range(len(nums)):
        for end in range(start + 1, len(nums) + 1):
            if prefix_sum[end] - prefix_sum[start] == k:
                count += 1
    
    return count

# Example usage
nums = [1, 1, 1]
k = 2
print("Number of subarrays:", subarray_sum_prefix_sum(nums, k))