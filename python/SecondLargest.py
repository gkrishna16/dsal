class Solution:
    def secondLargest(self, nums):
        largest_index = self.largest(nums)
        res = -1

        for i in range(len(nums)):
            # only enters the condition if the element is smaller than the largest
            if nums[i] != nums[largest_index]:
                if res == -1:
                    res = i
                elif nums[res] < nums[i]:
                    res = i
        return res

    def largest(self, nums):
        lar_ind = 0

        for i in range(1, len(nums)):
            if (nums[0] < nums[i]):
                lar_ind = i

        return lar_ind


sol = Solution()
val = sol.largest([5, 4, 3, 2, 87])
second_larg = sol.secondLargest([12, 12, 12, 7])
print(f"{val} is the largest element index.")
print(f"{second_larg} is the second largest number index.")
