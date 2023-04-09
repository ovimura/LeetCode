from typing import List


class Solution:
    def findGCD(self, nums: List[int]) -> int:
        l = min(nums)
        r = max(nums)
        gcd = []
        for i in range(1, l+1):
            if l % i == 0 and r % i == 0:
                gcd.append(i)
        return max(gcd)


sol = Solution()

assert 2 == (sol.findGCD([2, 5, 6, 9, 10]))

