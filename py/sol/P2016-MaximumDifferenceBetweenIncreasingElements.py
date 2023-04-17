from typing import List


class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        max_diff = -1
        for i in range(len(nums)):
            for j in range(i, len(nums)):
                if nums[i] < nums[j]:
                    max_diff = max(max_diff, abs(nums[i] - nums[j]))
        return max_diff


s = Solution()

assert 4 == (s.maximumDifference([7, 1, 5, 4]))

