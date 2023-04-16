from typing import List


class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if len(original) != (m*n):
            return []
        else:
            r = []
            t = []
            count = 0
            for i in range(len(original)):
                count += 1
                t.append(original[i])
                if count == n:
                    r.append(t)
                    t = []
                    count = 0
            return r


s = Solution()

assert [[1, 2], [3, 4]] == (s.construct2DArray([1, 2, 3, 4], 2, 2))
assert [[1, 2, 3]] == (s.construct2DArray([1, 2, 3], 1, 3))
