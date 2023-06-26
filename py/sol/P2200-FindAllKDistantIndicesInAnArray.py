from typing import List

class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        r = set()
        for i in range(len(nums)):
            for j in range(len(nums)):
                if abs(i-j) <= k and nums[j] == key:
                    r.add(i)
        return sorted(r)


s = Solution()

assert [1, 2, 3, 4, 5, 6] == (s.findKDistantIndices([3, 4, 9, 1, 3, 9, 5], 9, 1))
