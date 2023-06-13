class Solution:
    def countEven(self, num: int) -> int:
        c = 0
        for i in range(1, num+1):
            if i < 10 and (i % 2) == 0:
                c += 1
            else:
                su = 0
                ss = str(i)
                for n in ss:
                    su += int(n)
                if su % 2 == 0:
                    c += 1
        return c


s = Solution()

assert 14 == (s.countEven(30))

