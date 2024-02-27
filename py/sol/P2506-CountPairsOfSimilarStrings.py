from typing import List


class Solution:
    def similarPairs(self, words: List[str]) -> int:
        r = 0
        for i in range(len(words)-1):
            a = set([x for x in words[i]])
            a = sorted(a)
            for j in range(i+1, len(words)):
                b = set([x for x in words[j]])
                b = sorted(b)
                aa = "".join(a)
                bb = "".join(b)
#                if aa.find(bb) != -1 and bb.find(aa) != -1:
                if aa == bb:
                    r += 1
        return r


s = Solution()

assert 2 == (s.similarPairs(["aba","aabb","abcd","bac","aabc"]))

