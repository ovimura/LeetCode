from typing import List


class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        count = 0
        for w in words:
            if len(w) <= len(s):
                if w == s[:len(w)]:
                    count += 1
        return count


s = Solution()

assert 2 == (s.countPrefixes(["a", "a"], "aa"))
assert 3 == (s.countPrefixes(["a", "b", "c", "ab", "bc", "abc"], "abc"))

