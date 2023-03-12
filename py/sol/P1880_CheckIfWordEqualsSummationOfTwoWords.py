
class Solution:

    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        cf = ""
        cse = ""
        ct = ""
        for f in firstWord:
            v = ord(f) - ord('a')
            cf += str(v)
        for se in secondWord:
            v = ord(se) - ord('a')
            cse += str(v)
        for t in targetWord:
            v = ord(t) - ord('a')
            ct += str(v)
        return (int(cf) + int(cse)) == int(ct)


s = Solution()

assert (s.isSumEqual("acb", "cba", "cdb"))


