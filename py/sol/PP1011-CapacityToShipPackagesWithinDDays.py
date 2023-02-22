from typing import List


class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        lo = 0
        hi = 0

        def canShip(opacity):
            d = 1
            remain = opacity
            for weight in weights:
                if weight > opacity:
                    return False
                remain -= weight
                if remain < 0:
                    d += 1
                    remain = opacity - weight
            return d <= days

        for weight in weights:
            hi += weight
        while lo < hi:
            mid = (lo + hi) // 2
            if canShip(mid):
                hi = mid
            else:
                lo = mid + 1

        return lo


s = Solution()

assert 15 == s.shipWithinDays([1,2,3,4,5,6,7,8,9,10], 5)
