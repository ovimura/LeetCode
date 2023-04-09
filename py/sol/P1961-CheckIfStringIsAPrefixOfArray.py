from typing import List


class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        t = ""
        for w in words:
            t += w
            if t == s:
                return True
        return False


sol = Solution()

assert (sol.isPrefixString("iloveleetcode", ["i","love","leetcode","apples"]))
