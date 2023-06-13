from typing import List


class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        r = []
        c1 = s[0]
        r1 = int(s[1])
        c2 = s[3]
        r2 = int(s[4])
        cc1 = int(ord(c1) - ord('A'))
        cc2 = int(ord(c2) - ord('A'))
        for j in range(cc1, cc2+1):
            for i in range(r1, r2+1):
                r.append("{}{}".format(chr(ord('A') + j), i))
        return r


ss = Solution()

assert ["A1", "A2", "B1", "B2"] == (ss.cellsInRange("A1:B2"))

