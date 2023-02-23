from typing import List


class Solution:

    def minOperations(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0
        op = 0
        for i in range(1, len(nums)):
            while nums[i] <= nums[i-1]:
                t = ((nums[i - 1] - nums[i]) + 1)
                op += t
                nums[i] += t
        return op


s = Solution()

assert 3 == (s.minOperations([1, 1, 1]))
assert 14 == (s.minOperations([1, 5, 2, 4, 1]))
assert 0 == (s.minOperations([1]))

