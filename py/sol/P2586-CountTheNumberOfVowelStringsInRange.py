
from typing import List


class Solution:

    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        vowels = ['a', 'e', 'i', 'o', 'u']
        r = []
        for i in range(left, right+1):
            if (words[i][0] in vowels) and (words[i][-1] in vowels):
                r.append(words[i])
        return len(r)


s = Solution()

assert 2 == (s.vowelStrings(["are","amy","u"], 0, 2))


