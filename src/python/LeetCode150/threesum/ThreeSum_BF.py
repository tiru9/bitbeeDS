def three_sum_brute_force(nums):
    n = len(nums)
    unique_triplets = set()

    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if nums[i] + nums[j] + nums[k] == 0:
                    triplet = tuple(sorted([nums[i], nums[j], nums[k]]))
                    unique_triplets.add(triplet)

    return list(unique_triplets)

# Example Usage
nums = [-1, 0, 1, 2, -1, -4]
print(three_sum_brute_force(nums))
