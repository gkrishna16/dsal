from collections import defaultdict
import collections


class Solution:
    def groupAnagrams(self, strs):
        # this adds lists as values
        # myDict = collections.defaultdict(tuple)
        myDict = {}

        for str in strs:
            count = [0] * 26
            for s in str:
                count[ord(s) - ord('a')] += 1
            if tuple(count) in myDict.keys():
                myDict[tuple(count)].append(str)
            else:
                myDict[tuple(count)] = [str]
        return myDict.values()


sol = Solution()
val = sol.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
print(val)


dict1 = collections.defaultdict(list)
dict1['name'].append('1')
dict1['name'].append('1')
print(dict1)
