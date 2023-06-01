class Solution:
    def isPalindrm(self, strs):
        res = ''

        for s in strs:
            if s.isalnum():
                res += s.lower()

        return res == res[::-1]


print(Solution().isPalindrm('acad'))
