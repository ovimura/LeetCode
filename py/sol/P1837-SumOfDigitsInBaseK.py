class Solution:
    def sumBase(self, n: int, k: int) -> int:
        res = 0
        while n > 0:
            res += (n % k)
            n = n // k
        return res


s = Solution()

assert 9 == s.sumBase(34, 6)
