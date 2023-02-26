class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        good = []
        for i in range(len(s)-2):
            un = set()
            for j in range(i, i+3):
                un.add(s[j])
            if len(un) == 3:
                good.append("".join(un))
        return len(good)


ss = Solution()

assert 1 == (ss.countGoodSubstrings("xyzzaz"))
assert 4 == (ss.countGoodSubstrings("aababcabc"))


