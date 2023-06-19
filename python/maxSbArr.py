import sys


class Solution:
    def maxSubArr(nums):
        maxi = 0
        for i in range(i, len(nums)):
            sum = 0
            for j in range(i, len(nums)):
                sum += nums[j]
                maxi = max(maxi, sum)  # geting the maximum

        print(maxi)
        return maxi


arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
sol = Solution()
print(sol.maxSubArr(arr))
