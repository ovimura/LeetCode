class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        ws = sentence.split(" ")
        if ws[0][0] != ws[-1][-1]:
            return False
        else:
            for i in range(1, len(ws)):
                if ws[i-1][-1] != ws[i][0]:
                    return False
        return True


s = Solution()

assert (s.isCircularSentence("leetcode exercises sound delightful"))
assert (s.isCircularSentence("eetcode"))
