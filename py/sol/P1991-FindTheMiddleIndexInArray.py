from typing import List


class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0
        for i in range(len(nums)):
            if sum(nums[:i]) == sum(nums[i+1:]):
                return i
        return -1


ss = Solution()

assert 3 == (ss.findMiddleIndex([2, 3, -1, 8, 4]))

