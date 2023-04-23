from typing import List


class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        i = 0
        n = len(tickets)
        r = 0
        while tickets[k] > 0:
            if tickets[i % n] > 0:
                r += 1
            if tickets[i % n] > 0:
                tickets[i % n] -= 1
                i += 1
            else:
                i += 1
        return r


s = Solution()

assert 6 == (s.timeRequiredToBuy([2, 3, 2], 2))
assert 8 == (s.timeRequiredToBuy([5, 1, 1, 1], 0))

