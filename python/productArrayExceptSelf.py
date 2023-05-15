class Solution:
    def productOfSelfExceptSelf(self, nums):
        answer = [1] * (len(nums))

        leftPrefix = 1

        for i in range(len(nums)):
            answer[i] = leftPrefix
            leftPrefix *= nums[i]
        # print(answer)

        rightPrefix = 1
        for j in range(len(nums) - 1, -1, -1):
            answer[j] *= rightPrefix
            rightPrefix *= nums[j]
        # print(answer)
        return answer


sol = Solution()
print(sol.productOfSelfExceptSelf([1, 2, 3, 4]))
