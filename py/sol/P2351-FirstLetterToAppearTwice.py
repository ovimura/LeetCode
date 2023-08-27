

class Solution:
    def repeatedCharacter(self, s: str) -> str:
        mem = []
        for l in s:
            if l not in mem:
                mem.append(l)
            else:
                return l
        return ""


sol = Solution()

assert "c" == (sol.repeatedCharacter("abccbaacz"))
assert "d" == (sol.repeatedCharacter("abcdd"))


