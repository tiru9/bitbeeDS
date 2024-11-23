def two_sum_two_pointer(nums, target):
    # Create a sorted array of pairs (element, index)
    sorted_pairs = sorted(zip(nums, range(len(nums))), key=lambda x: x[0])

    # Initialize two pointers
    left, right = 0, len(nums) - 1

    # Iterate using two pointers
    while left < right:
        current_sum = sorted_pairs[left][0] + sorted_pairs[right][0]
        if current_sum == target:
            return [sorted_pairs[left][1], sorted_pairs[right][1]]
        elif current_sum < target:
            left += 1
        else:
            right -= 1

    return []

# Example usage
nums = [2, 7, 11, 15]
target = 9
print(two_sum_two_pointer(nums, target))  # Output: [0, 1]

