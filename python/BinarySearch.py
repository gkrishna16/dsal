class Solution:
    def bnrySrch(self, arr, x):
        low = 0
        high = len(arr) - 1
        mid = 0

        while low <= high:
            mid = (high + low) // 2

        # If x is greater, ignore left half
            if arr[mid] < x:
                low = mid + 1

        # If x is smaller, ignore right half
            elif arr[mid] > x:
                high = mid - 1

        # means x is present at mid
            else:
                return mid

    # If we reach here, then the element was not present
        return -1


nums = [1, 2, 24, 456, 8]
x = 456
sol = Solution()
val = sol.bnrySrch(nums, x)
print(val)


# nums = [1, 2, 24, 456, 8]
# print(nums[:5:3])
