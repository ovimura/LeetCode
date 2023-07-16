

class Solution:

    def minBitFlips(self, start: int, goal: int) -> int:
        s1 = "{0:b}".format(start)
        s2 = "{0:b}".format(goal)
        r = 0
        if len(s1) == len(s2):
            for i in range(len(s1)):
                if s1[i] != s2[i]:
                    r += 1
        elif len(s2) > len(s1):
            leading_bits = len(s2) - len(s1)
            for i in range(len(s1)):
                if s1[len(s1)-i-1] != s2[len(s2)-i-1]:
                    r += 1
            for j in range(leading_bits):
                if s2[j] == "1":
                    r += 1
        elif len(s2) < len(s1):
            leading_bits = len(s1) - len(s2)
            for i in range(len(s2)):
                if s1[len(s1)-i-1] != s2[len(s2)-i-1]:
                    r += 1
            for j in range(leading_bits):
                if s1[j] == "1":
                    r += 1
        return r


s = Solution()

assert 3 == (s.minBitFlips(3, 4))

