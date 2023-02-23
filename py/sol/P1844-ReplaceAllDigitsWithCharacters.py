class Solution:

    def replaceDigits(self, s: str) -> str:
        i = 0
        r = []
        for a in s:
            if i % 2 != 0:
                r.append(chr(ord(s[i-1])+int(s[i])))
            else:
                r.append(a)
            i+=1
        return "".join(r)


s = Solution()

assert "abcdef" == s.replaceDigits("a1c1e1")
