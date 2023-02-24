class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        al = [0]*26
        for s in sentence:
            al[ord(s) - ord('a')] += 1
        for a in al:
            if a == 0:
                return False
        return True


s = Solution()

assert s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")

assert not s.checkIfPangram("leetcode")

