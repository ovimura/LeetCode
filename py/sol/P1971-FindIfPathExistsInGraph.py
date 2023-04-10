from typing import List


class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        visited = [False] * n
        result = []
        self.dfs(source, destination, edges, visited, result)
        if source in result and destination in result:
            return True
        return False

    def dfs(self, src, dst, edges, visited, r):
        if not visited[src]:
            visited[src] = True
        r.append(src)
        neighbors = []
        for e in edges:
            if src in e:
                if src != e[0]:
                    neighbors.append(e[0])
                if src != e[1]:
                    neighbors.append(e[1])
        if dst in neighbors:
            r.append(dst)
            return
        else:
            for n in neighbors:
                if not visited[n]:
                    self.dfs(n, dst, edges, visited, r)


sol = Solution()

assert (sol.validPath(3, [[0, 1], [1, 2], [2, 0]], 0, 2))
assert not (sol.validPath(6, [[0,1],[0,2],[3,5],[5,4],[4,3]], 0, 5))
assert (sol.validPath(10, [[0, 7], [0, 8], [6, 1], [2, 0], [0, 4], [5, 8], [4, 7], [1, 3], [3, 5], [6, 5]], 7, 5))



