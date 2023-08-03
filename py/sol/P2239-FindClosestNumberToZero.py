from typing import List


class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        m = 1000000
        for n in nums:
            if abs(n) < abs(m):
                m = n
            elif abs(n) == abs(m):
                m = max(n, m)
        return m


s = Solution()

assert 1 == (s.findClosestNumber([-4, -2, 1, 4, 8]))

