from typing import List


class Solution:
    def isCovered(self, ranges: List[List[int]], left: int, right: int) -> bool:
        i = 0
        for r in range(left, right + 1):
            for a in ranges:
                if r in [x for x in range(a[0], a[1] + 1)]:
                    i += 1
            if i == 0:
                return False
            else:
                i = 0
        return True


s = Solution()

assert (s.isCovered([[1, 2], [3, 4], [5, 6]], left=2, right=5))


