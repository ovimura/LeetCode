
class Solution:
    def countAsterisks(self, s: str) -> int:
        r = 0
        no_of_bars = 0
        for c in s:
            if c == '|':
                no_of_bars += 1
            elif c == '*':
                if no_of_bars % 2 == 0:
                    r += 1
        return r


s = Solution()

assert 2 == (s.countAsterisks("l|*e*et|c**o|*de|"))

