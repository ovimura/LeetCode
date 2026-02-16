class Solution:
    def toggleLightBulbs(self, bulbs: list[int]) -> list[int]:
        b_vals = [0]*101
        for i in range(len(bulbs)):
            if b_vals[bulbs[i]] == 0:
                b_vals[bulbs[i]] = 1
            else:
                b_vals[bulbs[i]] = 0
        r = []
        for j in range(1, len(b_vals)):
            if b_vals[j] != 0:
                r.append(j)
        sorted(r)
        return r


s = Solution()

assert [20, 30] == (s.toggleLightBulbs([10, 20, 30, 10]))
assert [] == (s.toggleLightBulbs([100, 100]))
