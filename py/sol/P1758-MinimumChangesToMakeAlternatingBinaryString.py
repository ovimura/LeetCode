
class Solution:

    def minOperations(self, s: str) -> int:
        first = 0
        second = 0
        if len(s) == 1:
            return 0
        elif len(s) == 2 and s[0] != s[1]:
            return 0
        elif len(s) == 2 and s[0] == s[1]:
            return 1
        r = 0
        if s[0] == '0':
            for i in range(0, len(s), 2):
                if s[i] != '0':
                    first += 1
            for j in range(1, len(s), 2):
                if s[j] != '1':
                    second += 1
            r = first+second
        else:
            for i in range(0, len(s), 2):
                if s[i] != '1':
                    first += 1
            for j in range(1, len(s), 2):
                if s[j] != '0':
                    second += 1
            r = first+second
        rr = 0
        fi = 0
        se = 0
        if s[0] == '0':
            for i in range(0, len(s), 2):
                if s[i] != '1':
                    fi += 1
            for j in range(1, len(s), 2):
                if s[j] != '0':
                    se += 1
            rr = fi+se
        else:
            for i in range(0, len(s), 2):
                if s[i] != '0':
                    fi += 1
            for j in range(1, len(s), 2):
                if s[j] != '1':
                    se += 1
            rr = fi+se
        return min(r, rr)


s = Solution()

assert 1 == (s.minOperations("0100"))
assert 0 == (s.minOperations("10"))
assert 2 == (s.minOperations("1111"))
assert 2 == (s.minOperations("110010"))
assert 3 == (s.minOperations("10010100"))
