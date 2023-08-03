
class Solution:
    def largestGoodInteger(self, num: str) -> str:
        r = []
        for i in range(2, len(num)):
            if int(num[i-2]) == int(num[i-1]) == int(num[i]):
                r.append(num[i])
        r.sort()
        if len(r) > 0:
            return str(r[-1])+str(r[-1])+str(r[-1])
        else:
            return ""


s = Solution()

assert "777" == (s.largestGoodInteger("6777133339"))


