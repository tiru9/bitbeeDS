def three_sum_hashmap(nums):
    nums.sort()  # Sort to handle duplicates easily
    n = len(nums)
    triplets = set()

    for i in range(n):
        target = -nums[i]
        seen = set()

        for j in range(i + 1, n):
            complement = target - nums[j]
            if complement in seen:
                triplets.add((nums[i], nums[j], complement))
            seen.add(nums[j])

    return [list(triplet) for triplet in triplets]

# Example Usage
nums = [-1, 0, 1, 2, -1, -4]
print(three_sum_hashmap(nums))
