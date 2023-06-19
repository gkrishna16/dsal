class Solution:
    def rearrPosNeg(self, nums: list) -> list:
        pos = []
        neg = []

        for i in range(len(nums)):
            if (nums[i] > 0):
                pos.append(nums[i])
            else:
                neg.append(nums[i])

        print(pos, neg)

        for i in range(len(nums)//2):
            nums[i*2] = pos[i]
            nums[i*2+1] = neg[i]

        print(nums)


sol = Solution()
sol.rearrPosNeg([1, 2, -4, -5])
