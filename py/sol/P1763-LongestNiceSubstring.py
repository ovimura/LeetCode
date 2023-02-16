
class Solution:

    def longestNiceSubstring(self, s: str) -> str:
        if len(s) == 1:
            return ""
        temp = []
        for i in range(len(s)):
            t = ""
            for j in range(i, len(s)):
                t += s[j]
                temp.append(t)
        r = []
        m = -1
        for x in temp:
            if self.isNice(x):
                if len(x) > m:
                    m = len(x)
                r.append(x)
        result = []
        for z in r:
            if len(z) == m:
                result.append(z)
        if len(result) > 0:
            return result[0]
        else:
            return ""

    def isNice(self, ss: str) -> bool:
        alphabet = [0] * 26
        for a in ss:
            if ord(a) >= ord('a'):
                i = abs(ord(a) - 97)
                alphabet[i] += 1
            else:
                i = abs(ord(a) - 65)
                alphabet[i] += 1000
        for t in ss:
            if ord(t) >= ord('a'):
                i = abs(ord(t) - 97)
                if alphabet[i] % 1000 == 0 or alphabet[i] < 1001:
                    return False
            else:
                i = abs(ord(t) - 65)
                if alphabet[i] % 1000 == 0 or alphabet[i] < 1001:
                    return False
        return True


sol = Solution()


assert "Xx" == sol.longestNiceSubstring("XqLJWaEEcAjslIXxKZgufikxFwVVYUlvYrIeGRyS")

print(sol.longestNiceSubstring("XqLJWaEEcAjslIXxKZgufikxFwVVYUlvYrIeGRyS"))
