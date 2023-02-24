class Solution:

    def sortSentence(self, s: str) -> str:
        words = []
        ws = s.split(' ')
        for i in range(1, 10):
            for w in ws:
                if str(i) in w:
                    words.append(w)
                    break
        r = ""
        j = 0
        for w in words:
            if j < len(words)-1:
                r += w[:-1] + " "
            else:
                r += w[:-1]
            j += 1
        return r


s = Solution()

assert "This is a sentence" == s.sortSentence("is2 sentence4 This1 a3")
