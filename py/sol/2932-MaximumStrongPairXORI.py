from typing import List


class Solution:
    def maximumStrongPairXor(self, nums: List[int]) -> int:
        r = 0
        strong = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if abs(nums[i] - nums[j]) <= min(nums[i], nums[j]):
                    strong.append((nums[i], nums[j], nums[i] ^ nums[j]))

        for s in strong:
            if s[2] > r:
                r = s[2]
        return r


ss = Solution()

assert 7 == (ss.maximumStrongPairXor([1, 2, 3, 4, 5]))
