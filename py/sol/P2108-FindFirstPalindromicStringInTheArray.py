from typing import List


class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for w in words:
            isPalindrome = True
            mid = len(w) // 2
            for i in range(mid):
                if w[i] != w[len(w)-1-i]:
                    isPalindrome = False
                    break
            if isPalindrome:
                return w
        return ""


s = Solution()

print(s.firstPalindrome(["abc", "car", "ada", "racecar", "cool"]))
