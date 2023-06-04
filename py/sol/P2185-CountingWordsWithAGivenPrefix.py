from typing import List


class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        count = 0
        for w in words:
            if w.startswith(pref):
                count += 1
        return count


s = Solution()

assert 2 == (s.prefixCount(["pay","attention","practice","attend"], "at"))

