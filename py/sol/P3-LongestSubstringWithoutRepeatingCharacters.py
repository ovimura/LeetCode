
class Solution:
    def has_dup(self, ss: str) -> bool:
        for i in range(len(ss)):
            if ss[i] in ss[i+1:]:
                return True
        return False

    def lengthOfLongestSubstring(self, sss: str) -> int:
        r = 0
        for i in range(len(sss)-1):
            c = 0
            for j in range(i+1, len(sss)+1):
                if not self.has_dup(sss[i: j]):
                    c += 1
                else:
                    break
            if c > r:
                r = c
        return r


s = Solution()

assert 3 == (s.lengthOfLongestSubstring('abcabcbb'))
assert 3 == (s.lengthOfLongestSubstring('abc'))
