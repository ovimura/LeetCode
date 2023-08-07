

class Solution:
    def sum(self, num1: int, num2: int) -> int:
        return num1 + num2


s = Solution()

assert 17 == (s.sum(12, 5))
assert -6 == (s.sum(-10, 4))

