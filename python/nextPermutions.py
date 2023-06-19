class Solution:
    def nxtPrmtn(self, nums):
        ind = -1
        for i in range(len(nums) - 2, -1, -1):
            if nums[i + 1] > nums[i]:
                ind = i
                break
        # reverse array as there are not
        if ind == -1:
            return nums.reverse()
        print(ind)

        # swap the largest element
        for i in range(len(nums) - 1, ind, -1):
            if nums[i] > nums[ind]:
                nums[i], nums[ind] = nums[ind], nums[i]
                break

        print(nums)

        # Step 3: reverse the right half:
        nums[ind+1:] = reversed(nums[ind+1:])
        return nums


Solution().nxtPrmtn([2, 1, 5, 4, 3, 0, 0])
