def maxProduct_dp(nums):
    if not nums:
        return 0
    max_so_far = min_so_far = result = nums[0]
    for num in nums[1:]:
        a = max_so_far * num
        b = min_so_far * num
        max_so_far = max(num, a, b)
        min_so_far = min(num, a, b)
        result = max(result, max_so_far)
    return result


# Example usage
if __name__ == "__main__":
    # Input: List of numbers
    nums = [7, 1, -5, 3, 6, -4]
    print("Maximum product sub array:", maxProduct_dp(nums))