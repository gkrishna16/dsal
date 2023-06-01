class Solution:
    def threeSum(self, nums):
        nums.sort()
        res = []

        for index, value in enumerate(nums):
            if index > 0 and nums[index] == nums[index - 1]:
                continue
            left, right = index + 1, len(nums) - 1
            while left < right:
                currSum = nums[left] + nums[right] + nums[index]
                if currSum > 0:
                    right -= 1
                elif (currSum < 0):
                    left += 1
                else:
                    res.append([value, nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while nums[right + 1] == nums[right] and left < right:
                        right -= 1

        return res


arr = [-1, 0, 1, 2, -1, -4]
sol = Solution()
print(sol.threeSum(arr))
