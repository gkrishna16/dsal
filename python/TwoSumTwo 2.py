class Solution:
    def twoSumTwo(self, nums, target):
        left_pointer, right_pointer = 0, len(nums) - 1

        while left_pointer < right_pointer:
            currSum = nums[left_pointer] + nums[right_pointer]

            if currSum > target:
                right_pointer -= 1
            elif currSum < target:
                left_pointer += 1
            else:
                return [left_pointer + 1, right_pointer + 1]
        return []


sol = Solution()
val = sol.twoSumTwo([2, 3, 4, 54], 7)
print(val)
