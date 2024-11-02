def two_sum_map(nums, target):
    map = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in map:
            return [map[complement], i]
        map[num] = i
    return []

# Example usage
nums = [2, 7, 11, 15]
target = 9
print(two_sum_map(nums, target))  # Output: [0, 1]