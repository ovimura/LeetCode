from typing import List


class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        i = 0
        groups = []
        while i < len(s):
            temp = s[i: i+k]
            groups.append(temp)
            i += k
        if len(groups[-1]) != k:
            miss = k - len(groups[-1])
            pattern = ""
            for i in range(miss):
                pattern += fill
            last_str = groups[-1] + pattern
            temp_gr = groups[:-1]
            temp_gr.append(last_str)
            return temp_gr
        return groups


s = Solution()

assert ['abc', 'def', 'ghi'] == (s.divideString("abcdefghi", 3, "x"))

