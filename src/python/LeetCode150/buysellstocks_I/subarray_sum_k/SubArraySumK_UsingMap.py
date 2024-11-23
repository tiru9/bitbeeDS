class SubArraySumK_UsingMap(object):
    # Initialize prefix sum map and variables
    prefix_sum_map = {0: 1}  # Store prefix sum frequencies
    sum_ = 0
    count = 0

    # Iterate through the array
    for num in nums:
        sum_ += num  # Update the cumulative sum

        # Check if sum_ - k exists in the map
        if (sum_ - k) in prefix_sum_map:
            count += prefix_sum_map[sum_ - k]  # Add its frequency to count

        # Update the prefix sum map with the current sum_
        prefix_sum_map[sum_] = prefix_sum_map.get(sum_, 0) + 1

    return count