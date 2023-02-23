class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        i = 0
        ws = s.split(' ')
        words = ""
        for w in ws:
            words += w
            i += 1
            if i != k:
                words += " "
            if i == k:
                break
        return words


s = Solution()

assert "Hello how are you" == s.truncateSentence("Hello how are you Contestant", 4)

