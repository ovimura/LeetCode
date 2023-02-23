from typing import List


class Solution:

    def arraySign(self, nums: List[int]) -> int:
        p = 1
        for x in nums:
            p *= x
        if p > 0:
            return 1
        elif p == 0:
            return 0
        else:
            return -1


s = Solution()

assert 1 == s.arraySign([-1, -2, -3, -4, 3, 2, 1])



