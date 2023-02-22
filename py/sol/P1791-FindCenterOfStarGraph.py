from typing import List


class Solution:

    def findCenter(self, edges: List[List[int]]) -> int:
        dic = {}
        for e in edges:
            if e[0] not in dic.keys():
                dic[e[0]] = [e[1]]
            else:
                v = dic[e[0]]
                v.append(e[1])
                dic[e[0]] = v
            if e[1] not in dic.keys():
                dic[e[1]] = [e[0]]
            else:
                v = dic[e[1]]
                v.append(e[0])
                dic[e[1]] = v
        n = len(dic.keys())
        for k in dic.keys():
            s = set(dic[k])
            if len(s) == n-1:
                return k


s = Solution()


assert 2 == (s.findCenter([[1, 2], [2, 3], [4, 2]]))

t = s.findCenter([[1,16],[16,2],[3,16],[4,16],[16,5],[16,6],[7,16],[16,8],[9,16],[10,16],[16,11],[12,16],[16,13],[16,14],[15,16],[16,17]])

assert 16 == t

