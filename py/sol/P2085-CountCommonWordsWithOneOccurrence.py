from typing import List

class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        freq1 = {}
        freq2 = {}
        r = 0
        for w in words1:
            if w not in freq1.keys():
                freq1[w] = 1
            else:
                v = freq1[w] + 1
                freq1[w] = v
        for w in words2:
            if w not in freq2.keys():
                freq2[w] = 1
            else:
                v = freq2[w] + 1
                freq2[w] = v
        for f in freq1.keys():
            if freq1[f] == 1 and f in freq2.keys() and freq2[f] == 1:
                r += 1
        return r


s = Solution()

assert 2 == (s.countWords(["leetcode","is","amazing","as","is"], ["amazing","leetcode","is"]))


