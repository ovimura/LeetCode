from typing import List

class Solution:
    def dominantIndices(self, nums: List[int]) -> int:
        dominant = []
        for i in range(len(nums)-1):
            if nums[i] > sum(nums[i+1:])/len(nums[i+1:]):
                dominant.append(nums[i])
        return len(dominant)


s = Solution()

assert 2 == (s.dominantIndices([5,4,3]))
assert 1 == (s.dominantIndices([4,1,2]))
