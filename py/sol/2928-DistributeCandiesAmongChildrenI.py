
class Solution:
    def distributeCandies(self, n: int, limit: int) -> int:
        r = 0
        c1 = -1
        c2 = -1
        c3 = -1
        limit += 1
        for i in range(limit):
            c1 += 1
            c2 = -1
            c3 = -1
            for j in range(limit):
                c2 += 1
                c3 = -1
                for k in range(limit):
                    c3 += 1
                    if (c1 + c2 + c3) == n:
                        r += 1
        return r


s = Solution()

assert 3 == (s.distributeCandies(5, 2))

assert 10 == (s.distributeCandies(3, 3))
