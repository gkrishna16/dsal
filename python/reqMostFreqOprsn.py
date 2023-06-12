class Solution:
    def maxFreq(self, nums):
        hs = {}

        for i in range(len(nums)):
            hs[nums[i]] = hs.get(nums[i], 0) + 1
        return hs


sol = Solution()
print(sol.maxFreq([1, 1, 2, 2, 3, 5, 5, 5]))
