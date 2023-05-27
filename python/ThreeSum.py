class Solution:
    def threeSum(self, nums):
        nums.sort()
        print(nums)


arr = [5, 4, 3, 2, 1]
sol = Solution()
print(sol.threeSum([2, 3, 5, 6, 7, 9, 1, 8]))
# print(sol.threeSum(arr))
