from typing import List

class Solution:
    def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
        ret = {}
        for i in items1:
            if i[0] in ret.keys():
                v = ret[i[0]] + i[1]
                ret[i[0]] = v
            else:
                ret[i[0]] = i[1]
        for i in items2:
            if i[0] in ret.keys():
                v = ret[i[0]] + i[1]
                ret[i[0]] = v
            else:
                ret[i[0]] = i[1]
        t = []
        for k in ret.keys():
            t.append([k, ret[k]])
        t.sort()
        return t


s = Solution()

print(s.mergeSimilarItems([[1,1],[4,5],[3,8]], [[3,1],[1,5]]))

# [[1,6],[3,9],[4,5]]
# [[1,6],[3,9],[4,5]]

