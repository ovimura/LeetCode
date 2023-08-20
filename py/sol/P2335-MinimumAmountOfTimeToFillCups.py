from typing import List


class Solution:
    def fillCups(self, amount: List[int]) -> int:
        amount.sort()
        if amount[2] == 0:
            return 0
        if amount[1] == 0:
            return amount[2]
        else:
            amount[2] -= 1
            amount[1] -= 1
            return 1 + self.fillCups(amount)


s = Solution()

assert 4 == (s.fillCups([1, 4, 2]))
assert 7 == (s.fillCups([5, 4, 4]))
assert 5 == (s.fillCups([5, 0, 0]))




