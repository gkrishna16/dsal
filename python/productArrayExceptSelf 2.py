class Solution:
    def productOfSelfExceptSelf(self, nums):
        # answer = [1] * (len(nums))
        # prefix = 1
        answer = [1] * (len(nums))
        print(answer)

        for i in range(1, len(nums)):
            answer[i] = answer[i - 1] * nums[i-1]
            print(i)

        print(f"{answer} after first loop")

        postfix = 1
        for j in range(len(nums) - 1, -1, -1):
            answer[j] *= postfix
            postfix *= nums[j]

        return answer


sol = Solution()
print(sol.productOfSelfExceptSelf([1, 2, 3, 4]))

# res = [1, 2, 3, 4, 5]
# for i in range(1, len(res)):
#     print(res[i])
# for i in range(len(res) - 1, 0, -1):
#     print(res[i])
#     print('---')
