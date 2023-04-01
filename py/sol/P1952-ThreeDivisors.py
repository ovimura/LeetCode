class Solution:
    def isThree(self, n: int) -> bool:
        cnt = 0
        for k in range(1, 10001):
            if n % k == 0:
                cnt += 1
                if cnt > 3:
                    return False
        return cnt == 3


s = Solution()

assert not s.isThree(2)
assert s.isThree(4)
