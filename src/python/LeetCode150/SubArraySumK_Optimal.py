def subarray_sum(nums, k):
    # Initialize prefix sum map and variables
    prefix_sum_map = {0: 1}  # Start with sum 0 seen once
    sum_ = 0  # Running cumulative sum
    count = 0  # Count of subarrays

    # Iterate through the array
    for num in nums:
        sum_ += num  # Update cumulative sum
        
        # Check if (sum_ - k) exists in prefix_sum_map
        if (sum_ - k) in prefix_sum_map:
            count += prefix_sum_map[sum_ - k]  # Add its frequency to count
        
        # Update the prefix sum map with the current sum_
        prefix_sum_map[sum_] = prefix_sum_map.get(sum_, 0) + 1

    return count