class Solution:
    def countTriples(self, n: int) -> int:
        count = 0
        seq = set()
        for i in range(1, n+1):
            seq.add(i**2)
        for a in seq:
            for b in seq:
                if a + b in seq:
                    count += 1
        return count


s = Solution()

assert 2 == (s.countTriples(5))

