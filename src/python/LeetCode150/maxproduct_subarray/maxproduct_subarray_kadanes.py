#Kadane-style variation (swap on negative) O(N)
def maxProduct_kadane(nums):
    if not nums:
        return 0
    max_so_far = min_so_far = result = nums[0]
    for num in nums[1:]:
        if num < 0:
            max_so_far, min_so_far = min_so_far, max_so_far
        max_so_far = max(num, max_so_far * num)
        min_so_far = min(num, min_so_far * num)
        result = max(result, max_so_far)
    return result


# Example usage
if __name__ == "__main__":
    # Input: List of numbers
    nums = [7, 1, -5, 3, 6, -4]
    print("Maximum product sub array:", maxProduct_kadane(nums))