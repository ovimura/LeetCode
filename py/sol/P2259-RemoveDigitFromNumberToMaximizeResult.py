

class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        r = []
        f = False
        for i in range(len(number)-1):
            if not f and number[i] == digit and int(digit) < int(number[i+1]):
                f = True
                if i+1 == len(number)-1:
                    r.append(number[i+1])
                continue
            else:
                r.append(number[i])
                if i+1 == len(number)-1:
                    r.append(number[i+1])
        if not f:
            r = []
            for i in range(len(number)-1, -1, -1):
                if not f and number[i] == digit:
                    f = True
                    continue
                else:
                    r.append(number[i])
            r.reverse()
        return "".join(r)


s = Solution()

assert "51" == (s.removeDigit("551", "5"))

