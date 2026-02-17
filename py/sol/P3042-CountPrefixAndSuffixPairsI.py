from typing import List


class Solution:
    def isPrefixAndSuffix(self, str1, str2) -> bool:
        if str(str2).startswith(str(str1)) and str(str2).endswith(str(str1)):
            return True
        return False

    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        r = 0
        for i in range(len(words)):
            for j in range(i+1, len(words)):
                if self.isPrefixAndSuffix(words[i], words[j]):
                    r += 1
        return r


s = Solution()

assert 4 == (s.countPrefixSuffixPairs(["a", "aba", "ababa", "aa"]))
assert 0 == (s.countPrefixSuffixPairs([]))
