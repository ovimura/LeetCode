
class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        ks = []
        for b in range(0, (len(blocks)-k)+1):
            t = []
            for i in range(b, b+k):
                t.append(blocks[i])
            ks.append(t.copy())
        Bs = 0
        for kk in ks:
            Bs = max(Bs, len([x for x in kk if x == 'B']))
        return abs(k-Bs)


s = Solution()

assert 3 == (s.minimumRecolors("WBBWWBBWBW", 7))
assert 0 == (s.minimumRecolors("WBWBBBW", 2))

