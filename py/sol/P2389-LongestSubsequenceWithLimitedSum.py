from typing import List
class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        t = nums.copy()
        t.sort()
        ret = [0] * len(queries)
        for i in range(len(ret)):
            if queries[i] < t[0]:
                ret[i] = 0
            su = 0
            cnt = 0
            for j in range(len(t)):
                if queries[i] >= su + t[j]:
                    su += t[j]
                    cnt += 1
                else:
                    break
            ret[i] = cnt
        return ret


s = Solution()

assert [2, 3, 4] == (s.answerQueries([4,5,2,1], [3,10,21]))


