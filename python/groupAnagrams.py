from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs):

        myDict = defaultdict(list)

        for str in strs:
            count = [0] * 26

            for s in str:
                count[ord(s) - ord('a')] += 1
            myDict[tuple(count)].append(str)
        return myDict.values()


sol = Solution()
val = sol.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
print(val)
