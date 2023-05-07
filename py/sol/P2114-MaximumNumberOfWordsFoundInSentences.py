from typing import List

class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        most_words = 0
        for s in sentences:
            words = s.split(" ")
            if len(words) > most_words:
                most_words = len(words)
        return most_words


sol = Solution()

assert 6 == sol.mostWordsFound(["alice and bob love leetcode", "i think so too", "this is great thanks very much"])

