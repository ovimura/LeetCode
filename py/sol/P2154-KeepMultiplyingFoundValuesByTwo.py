from typing import List


class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        o = original
        while o in nums:
            o = o * 2
        return o


s = Solution()

assert 24 == (s.findFinalValue([5, 3, 6, 1, 12], 3))
