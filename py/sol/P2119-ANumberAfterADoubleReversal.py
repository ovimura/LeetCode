
class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        if num == 0:
            return True
        temp = str(num)
        reverse1 = ""
        isZ = 0
        for t in range(len(temp)):
            if isZ == 0 and temp[len(temp) - 1 - t] == "0":
                continue
            elif isZ == 0:
                isZ += 1
            if isZ != 0:
                reverse1 += temp[len(temp)-1-t]
        reverse2 = ""
        isZ = 0
        for r in range(len(reverse1)):
            if isZ == 0 and reverse1[len(reverse1) - 1 - r] == "0":
                continue
            elif isZ == 0:
                isZ += 1
            if isZ != 0:
                reverse2 += reverse1[len(reverse1) - 1 - r]
        if reverse2 == temp:
            return True
        else:
            return False


s = Solution()

assert (s.isSameAfterReversals(0))
assert not (s.isSameAfterReversals(1800))
assert (s.isSameAfterReversals(609576))


