class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        i = 0
        up = True
        while time >= 0:
            time -= 1
            if up:
                i+=1
            else:
                i-=1
            if i == n:
                up = False
            elif i == 1:
                up = True
        return i


s = Solution()

assert 2 == (s.passThePillow(4, 5))
assert 3 == s.passThePillow(3, 2)
assert 5 == s.passThePillow(18, 38)
