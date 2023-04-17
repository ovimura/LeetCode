from typing import List


class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        r = 0
        for op in operations:
            if op in ["X++", "++X"]:
                r += 1
            elif op in ["X--", "--X"]:
                r -= 1
        return r


s = Solution()

assert 1 == (s.finalValueAfterOperations(["--X","X++","X++"]))
