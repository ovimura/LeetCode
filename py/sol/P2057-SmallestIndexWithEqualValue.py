from typing import List

class Solution:
    def smallestEqual(self, nums: List[int]) -> int:
        r = []
        for i in range(len(nums)):
            if i % 10 == nums[i]:
                r.append(i)
        r.sort()
        if len(r) > 0:
            return r[0]
        else:
            return -1


s = Solution()

assert 0 == (s.smallestEqual([0, 1, 2]))

