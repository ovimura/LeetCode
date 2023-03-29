class Solution:
    def getLucky(self, s: str, k: int) -> int:
        luck = []
        su = 0
        for a in s:
            luck.append(str(int(ord(a) - ord('a')) + 1))
        while k > 0:
            su = 0
            l = "".join(luck)
            for i in l:
                su += int(i)
            luck.clear()
            for j in str(su):
                luck.append(j)
            k -= 1
        return su


sol = Solution()

assert 36 == (sol.getLucky("iiii", 1))
assert 6 == (sol.getLucky("leetcode", 2))
assert 8 == (sol.getLucky("zbax", 2))
