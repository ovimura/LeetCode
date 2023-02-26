class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        ones = [0]
        zeros = [0]
        o = 0
        l = 0
        for a in s:
            if a == '1':
                o += 1
                if len(s)-1 == l:
                    ones.append(o)
            else:
                if o != 0:
                    ones.append(o)
                o = 0
            l += 1
        z = 0
        l = 0
        for b in s:
            if b == "0":
                z += 1
                if len(s)-1 == l:
                    zeros.append(z)
            else:
                if z != 0:
                    zeros.append(z)
                z = 0
            l += 1
        mo = max(ones)
        mz = max(zeros)
        if mo > mz:
            return True
        else:
            return False


ss = Solution()

assert ss.checkZeroOnes("1101")
assert not ss.checkZeroOnes("111000")
assert ss.checkZeroOnes("1")
