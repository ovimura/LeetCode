from typing import List


class Solution:

    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        temp = []
        for i in range(len(nums)):
            if nums[i] == target:
                temp.append([i, nums[i]])
        m = 1000000
        for t in temp:
            a = abs(t[0]-start)
            if a < m:
                m = a
        return m


s = Solution()

assert 1 == s.getMinDistance([1, 2, 3, 4, 5], 5, 3)

