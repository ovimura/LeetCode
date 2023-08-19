from typing import List


class Solution:
    def checkXMatrix(self, grid: List[List[int]]) -> bool:
        n = len(grid)
        all_non_zeros = []
        X = []
        if n % 2 == 0:
            for i in range(n):
                if grid[i][i] != 0:
                    X.append(grid[i][i])
                if grid[i][n - 1 - i] != 0:
                    X.append(grid[i][n - 1 - i])
                for j in range(n):
                    if grid[i][j] != 0:
                        all_non_zeros.append(grid[i][j])
            X.sort()
            all_non_zeros.sort()
            if len(X) != 2*n:
                return False
            else:
                if X != all_non_zeros:
                    return False
                return True
        else:
            for i in range(n):
                for j in range(n):
                    if grid[i][j] != 0:
                        all_non_zeros.append(grid[i][j])
                if grid[i][i] != 0:
                    X.append(grid[i][i])
                if grid[i][n-1-i] != 0:
                    if i == (n//2):
                        continue
                    else:
                        X.append(grid[i][n-1-i])
        X.sort()
        all_non_zeros.sort()
        if len(X) != 2*n-1:
            return False
        else:
            if X != all_non_zeros:
                return False
            return True


s = Solution()

assert (s.checkXMatrix([[2, 0, 0, 1], [0, 3, 1, 0], [0, 5, 2, 0], [4, 0, 0, 2]]))
assert not (s.checkXMatrix([[5, 7, 0], [0, 3, 1], [0, 5, 0]]))
assert not (s.checkXMatrix([[5,0,0,1],[0,4,1,5],[0,5,2,0],[4,1,0,2]]))
assert not (s.checkXMatrix([
                        [2,0,0,0,1],
                        [0,4,0,1,5],
                        [0,0,5,0,0],
                        [0,5,0,2,0],
                        [4,0,0,0,2]]))

