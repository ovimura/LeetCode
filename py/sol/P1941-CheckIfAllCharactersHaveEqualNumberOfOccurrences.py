class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        freq = {}
        for k in s:
            if k not in freq.keys():
                freq[k] = 1
            else:
                v = freq[k] + 1
                freq[k] = v
        c = freq[list(freq.keys())[0]]
        for k in freq.keys():
            if freq[k] != c:
                return False
        return True


sol = Solution()

assert sol.areOccurrencesEqual("abacbc")
