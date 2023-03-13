from typing import List


class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        n = len(words)
        words_str = ""
        for w in words:
            words_str += w
        ws = list(words_str)
        ws.sort()
        freq = {}
        for w in ws:
            if w not in freq.keys():
                freq[w] = 1
            else:
                v = freq[w] + 1
                freq[w] = v
        for k in freq.keys():
            if freq[k] % n != 0:
                return False
        return True


s = Solution()

assert (s.makeEqual(["abc","aabc","bc"]))
assert not (s.makeEqual(["ab","a"]))
assert (s.makeEqual(["caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"]))
