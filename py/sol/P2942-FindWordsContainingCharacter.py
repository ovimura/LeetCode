from typing import List


class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        r = []
        for i, w in enumerate(words):
            if x in w:
                r.append(i)
        return r


s = Solution()

assert [0, 1] == (s.findWordsContaining(['Leetcode', 'Code'], 'e'))
