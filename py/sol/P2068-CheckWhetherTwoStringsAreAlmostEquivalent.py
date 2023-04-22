class Solution:
    def checkAlmostEquivalent(self, word1: str, word2: str) -> bool:
        m1 = {}
        m2 = {}
        for w in word1:
            if w not in m1.keys():
                m1[w] = 1
            else:
                v = m1[w] + 1
                m1[w] = v
        for w in word2:
            if w not in m2.keys():
                m2[w] = 1
            else:
                v = m2[w] + 1
                m2[w] = v
        for k in m1.keys():
            if k in m2.keys():
                if abs(m1[k] - m2[k]) > 3:
                    return False
            elif m1[k] > 3:
                return False
        for k in m2.keys():
            if k in m1.keys():
                if abs(m1[k] - m2[k]) > 3:
                    return False
            elif m2[k] > 3:
                return False
        return True


s = Solution()

assert not (s.checkAlmostEquivalent("aaaa", "bccb"))
assert (s.checkAlmostEquivalent("abcdeef", "abaaacc"))

