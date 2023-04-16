class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        for i in range(len(word)):
            if word[i] == ch:
                p1 = word[:i+1]
                p = ""
                for pp in p1:
                    p = pp + p
                p = p + word[i+1:]
                return p
        return word


s = Solution()

assert "dcbaef" == (s.reversePrefix("abcdef", "d"))

