class Solution:
    def longestConsStrng(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0

        for num in nums:
            # check if the number is starting or not
            if (num - 1) not in numSet:
                length = 0
                while (num + length) in numSet:
                    length += 1
                longest = max(length, longest)
        return longest


sol = Solution()
print(sol.longestConsStrng([1, 1, 1, 1, 5, 6, 7, 8]))
