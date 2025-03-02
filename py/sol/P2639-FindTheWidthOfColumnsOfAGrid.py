from typing import List


class Solution:
    def findColumnWidth(self, grid: List[List[int]]) -> List[int]:
        widths = []
        for j in range(len(grid[0])):
            cols = []
            for i in range(len(grid)):
                cols.append(grid[i][j])
            m1 = max(cols)
            m2 = min(cols)
            w1 = (len(str(m1)))
            w2 = (len(str(m2)))
            widths.append((max(w1, w2)))
        return widths


s = Solution()

assert [3] == (s.findColumnWidth([[-1], [2], [333]]))
