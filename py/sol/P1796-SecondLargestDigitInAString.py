
class Solution:
    def secondHighest(self, s: str) -> int:
        digits = []
        for c in s:
            if ord(c) >= ord('0') and ord(c) <= ord('9'):
                if c not in digits:
                    digits.append(c)
        digits.sort()
        if len(digits) < 2:
            return -1
        else:
            return int(digits[len(digits)-2])


s = Solution()

assert 2 == (s.secondHighest("dfa12321afd"))
