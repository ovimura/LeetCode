from typing import List

class Solution:
    def maximumValue(self, strs: List[str]) -> int:
        r = 0
        for ss in strs:
            if ss.isnumeric():
                if int(ss) > r:
                    r = int(ss)
            else:
                if len(ss) > r:
                    r = len(ss)
        return r


s = Solution()

assert 5 == (s.maximumValue(["alic3","bob","3","4","00000"]))
assert 1 == (s.maximumValue(["1","01","001","0001"]))
