class SubArraySumK_bruteForce(object):
    def subarraySum(self, nums, k):
        count = 0

        for start in range(len(nums)):
            sum = 0
            for end in range(start, len(nums)):
                sum += nums[end]

                if k == sum:
                    count += 1
        return count