from typing import List


class Solution:
    def capitalizeTitle(self, title: str) -> str:
        words = []
        temp = ""
        for t in title:
            if t != ' ':
                temp += t
            else:
                words.append(temp)
                temp = ""
        words.append(temp)
        final_words = []
        for w in words:
            if len(w) <= 2:
                w = w.lower()
                final_words.append(w)
            else:
                w = w.lower()
                tw = w[0].upper() + w[1:]
                final_words.append(tw)
        ret = ""
        for f in final_words:
            ret += f + " "
        return ret[:-1]


s = Solution()

print(s.capitalizeTitle("capiTalIze tHe titLe"))

