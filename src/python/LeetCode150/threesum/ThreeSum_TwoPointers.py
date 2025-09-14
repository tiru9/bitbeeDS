def three_sum_two_pointers(nums):
    nums.sort()  # Sort the array
    n = len(nums)
    triplets = []

    for i in range(n):
        # Skip duplicates for the fixed element
        if i > 0 and nums[i] == nums[i - 1]:
            continue

        target = -nums[i]
        left, right = i + 1, n - 1

        while left < right:
            current_sum = nums[left] + nums[right]

            if current_sum == target:
                triplets.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1

                # Skip duplicates for the two pointers
                while left < right and nums[left] == nums[left - 1]:
                    left += 1
                while left < right and nums[right] == nums[right + 1]:
                    right -= 1

            elif current_sum < target:
                left += 1
            else:
                right -= 1

    return triplets

# Example Usage
nums = [-1, 0, 1, 2, -1, -4]
print(three_sum_two_pointers(nums))
