from typing import List

class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        ret_n = len(grid) - 2
        ret = [[x] * ret_n for x in [0] * ret_n]
        for i in range(len(grid)-2):
            for j in range(len(grid)-2):
                t = self.check_center(grid, i+1, j+1)
                ret[i][j] = t
        return ret

    def check_center(self, g, i, j) -> int:
        r = 0
        for ii in range(i-1, i+2):
            for jj in range(j-1, j+2):
                r = max(r, g[ii][jj])
        return r


s = Solution()

assert [[9, 9], [8, 6]] == (s.largestLocal([[9, 9, 8, 1], [5, 6, 2, 6], [8, 2, 6, 4], [6, 2, 2, 2]]))

