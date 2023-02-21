
class Solution:

    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        if s1 == s2:
            return True
        ss1 = []
        ss2 = []
        indices = []
        for i in range(len(s1)):
            if s1[i] != s2[i]:
                ss1.append(s1[i])
                ss2.append(s2[i])
                indices.append(i)
        ss1.sort()
        ss2.sort()
        if len(ss1) != 2:
            return False
        return ss1 == ss2


s = Solution()

assert (s.areAlmostEqual("bank", "kanb"))

