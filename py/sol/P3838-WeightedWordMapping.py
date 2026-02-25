from typing import List



class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
        ww = []
        for w in words:
            t = 0
            for c in w:
                t += weights[ord(c) - ord('a')]
            ww.append((w, t))
        rev_alph = [chr(ord('a') + x) for x in range(26)]
        rev_alph.sort(reverse=True)
        r = ""
        for i in range(len(ww)):
            t = rev_alph[(ww[i][1] % 26)]
            r += t
        return r


s = Solution()

assert "rij" == s.mapWordWeights(["abcd", "def", "xyz"],
                                 [5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2])

assert "onhpnpevpaaxkkab" == (s.mapWordWeights(["ojibmbsqwf","nmcksaj","vinnwxscy","mweijrtyin","lqxxg","d","ykqyc","cqlzt","gimfdpp","rnvaqe","ajkaraz","aoceuywyxq","g","g","pmshdzobpw","wb"],
                       [22,14,17,36,47,23,15,44,30,30,45,16,18,17,48,35,13,40,19,36,45,16,36,36,12,26]))
