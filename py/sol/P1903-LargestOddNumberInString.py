class Solution:
    def largestOddNumber(self, num: str) -> str:
        largest = -1
        if int(num) % 2 == 1:
            return str(num)
        r = len(num)
        occur = 0
        for o in ["1", "3", "5", "7", "9"]:
            if o in num:
                occur += 1
        if occur == 0:
            return ""
        for n in range(r):
            if int(num[:r-n]) % 2 == 1:
                largest = int(num[:r-n])
                return str(largest)
        if largest == -1:
            return ""
        else:
            return str(largest)


s = Solution()

assert "5" == (s.largestOddNumber("52"))
assert "1013389" == (s.largestOddNumber("10133890"))
