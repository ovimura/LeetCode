from typing import List


class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        cnt = 0
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if abs(nums[i]-nums[j]) == k:
                    cnt += 1
        return cnt


sol = Solution()

assert 4 == (sol.countKDifference([1, 2, 2, 1], 1))
assert 0 == (sol.countKDifference([1, 3], 3))

