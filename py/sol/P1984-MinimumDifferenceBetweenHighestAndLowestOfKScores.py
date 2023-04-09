from typing import List


class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        differences = []
        for i in range(len(nums)-(k-1)):
            low = min(nums[i:i+k])
            hi = max(nums[i:i+k])
            differences.append(abs(hi-low))
        return min(differences)


sol = Solution()

assert 2 == (sol.minimumDifference([9, 4, 1, 7], 2))

