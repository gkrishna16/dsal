# class Solution:
#     def __init__(self):
#         self.name = 'gopal'

#     def encode(self, strs):

#         res = ''
#         for s in strs:
#             res += str(len(s)) + "#" + s
#         print(res)
#         return res

#     def decode(self, str):
#         res, i = [], 0

#         while i < len(str):
#             j = i
#             while str[j] != '#':
#                 j = j+1
#             length = int(str[i:j])
#             res.append(str[j + 1: j + 1 + length])
#             i = j + 1 + length
#         print(res)
#         return res

class Solution:
    # def __init__(self):

    def encode(self, strs: list[str]):
        res = ''

        for s in strs:
            res += str(len(s)) + "#" + s
        return res

    def decode(self, strn):
        res, i = [], 0

        while i < len(strn):
            j = i
            while strn[j] != '#':
                j = j + 1
                # j will stop at where is finds #
            length = int(strn[j - 1])
            res.append(strn[j+1:j+1 + length])
            i = j + 1 + length
        return res

    # def encode(self, strngs):
    #     res = ''
    #     for strn in strngs:
    #         res += '#' + str(len(strn)) + strn
    #     return res

    # def decode(self, strng):
    #     i, res = 0, []
    #     while i < len(strng):
    #         j = i
    #         while strng[j] != '#':
    #             j = j + 1
    #         length = int(strng[j - 1])
    #         res.append(strng[j+1:j+1+length])
    #         i = j + 1 + length
    #     return res


sol = Solution()

val = sol.encode(['gopal', 'krishan'])
print(val)
print(sol.decode(val))
