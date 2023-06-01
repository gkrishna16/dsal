class Solution:
    def cntnrWwtr(self, height):
        # Brute force
        res = 0
        for l in range(len(height)):
            for r in range(l + 1, len(height)):
                # area of triangel is always length * height
                area = (r - l) * min(height[r], height[l])
                res = max(res, area)

        return res

    def cntnrWtr(self, height):
        res = 0
        l, r = 0, len(height) - 1
        while l < r:
            area = (r-l) * min(height[l], height[r])
            res = max(res, area)

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1

        return res


sol = Solution()
val = sol.cntnrWtr([1, 8, 6, 2, 5, 4, 8, 3, 7])
print(val)
