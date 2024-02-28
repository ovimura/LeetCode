class Solution:
    def countDigits(self, num: int) -> int:
        r = 0
        for n in str(num):
            if num % int(n) == 0:
                r += 1
        return r


s = Solution()

assert 2 == (s.countDigits(77))