from typing import List


class Solution:
    def findChampion(self, grid: List[List[int]]) -> int:
        champion = -1
        for i in range(len(grid)):
            i_stronger = []
            j_stronger = []
            for j in range(len(grid[0])):
                if i != j:
                    if grid[i][j] == 1:
                        i_stronger.append(i)
                    else:
                        j_stronger.append(j)
            if len(i_stronger) == (len(grid[0])-1):
                champion = i
        return champion


s = Solution()

assert 0 == s.findChampion([[0, 1], [0, 0]])

assert 1 == s.findChampion([[0, 0, 1], [1, 0, 1], [0, 0, 0]])

assert 0 == s.findChampion([[0, 1, 1], [0, 0, 0], [0, 1, 0]])
