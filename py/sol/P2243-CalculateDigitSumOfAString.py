

class Solution:
    def digitSum(self, s: str, k: int) -> str:
        r = ""
        if len(s) <= k:
            return s
        else:
            while len(s) > k:
                grps = []
                if len(s) % k == 0:
                    for i in range(k, len(s)+1, k):
                        grps.append(s[i-k:i])
                else:
                    for i in range(k, len(s)+k, k):
                        grps.append(s[i-k:i])
                r = ""
                for g in grps:
                    su = sum([int(x) for x in g])
                    r += str(su)
                s = r
            r = s
            return r


ss = Solution()

assert "000" == (ss.digitSum("00000000", 3))
