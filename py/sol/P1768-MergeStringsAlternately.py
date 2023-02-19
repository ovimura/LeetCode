
class Solution:

    def mergeAlternately(self, word1: str, word2: str) -> str:
        max_len = max(len(word1), len(word2))
        r = ""
        for i in range(max_len):
            if i < len(word1):
                r = r + word1[i]
            if i < len(word2):
                r = r + word2[i]
        return r


s = Solution()


assert "azbzczzz" == (s.mergeAlternately("abc", "zzzzz"))

