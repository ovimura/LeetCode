from typing import List


class Solution:
    def countPairs(self, nums: List[int], k: int) -> int:
        pairs = []
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] == nums[j] and (i*j % k) == 0:
                    pairs.append((i, j))
        return len(pairs)


s = Solution()

assert 4 == (s.countPairs([3, 1, 2, 2, 2, 1, 3], 2))


