from typing import List

class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        max_dist = 0
        for i in range(len(colors)):
            for j in range(i, len(colors)):
                if colors[i] != colors[j]:
                    max_dist = max(max_dist, abs(j-i))
        return max_dist


s = Solution()

assert 3 == (s.maxDistance([1, 1, 1, 6, 1, 1, 1]))

