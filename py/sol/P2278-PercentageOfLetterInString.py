

class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        count_total = len(s)
        count_letter = 0
        for l in s:
            if l == letter:
                count_letter += 1
        return int((count_letter/count_total) * 100)


s = Solution()

assert 33 == (s.percentageLetter("foobar", "o"))
assert 0 == (s.percentageLetter("jjjj", "k"))

