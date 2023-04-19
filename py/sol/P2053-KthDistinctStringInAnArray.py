from typing import List

class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        freq = {}
        for a in arr:
            if a not in freq.keys():
                freq[a] = 1
            else:
                v = freq[a]+1
                freq[a] = v
        count = 0
        for a in arr:
            if freq[a] == 1:
                count += 1
                if count == k:
                    return a
        return ""


s = Solution()

assert "a" == (s.kthDistinct(["d","b","c","b","c","a"], 2))

