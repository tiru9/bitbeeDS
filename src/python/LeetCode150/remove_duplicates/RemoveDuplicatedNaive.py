class RemoveDuplicatesNaive(object):
    def removeDuplicates(self,nums):
        unique_nums = []
        for num in nums:
            if num not in unique_nums:
                unique_nums.append(num)

        # Overwrite the input array in-place
        for i in range(len(unique_nums)):
            nums[i] = unique_nums[i]

        return len(unique_nums)