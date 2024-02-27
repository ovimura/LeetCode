from typing import List

class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        r = 0
        n = len(grid)
        m = len(grid[0])
        g = sum([sum(x) for x in grid])
        while g > 0:
            max_vals = []
            for i in range(n):
                find_max = 0
                find_idx = 0
                for j in range(m):
                    if grid[i][j] > find_max:
                        find_max = grid[i][j]
                        find_idx = j
                max_vals.append(find_max)
                grid[i][find_idx] = 0
            r += max(max_vals)
            g = sum([sum(x) for x in grid])
        return r


s = Solution()

assert 6 == (s.deleteGreatestValue([[1, 2, 3], [1, 2, 3]]))
assert 8 == (s.deleteGreatestValue([[1, 2, 4], [3, 3, 1]]))
