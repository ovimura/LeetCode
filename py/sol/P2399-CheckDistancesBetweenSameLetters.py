from typing import List


class Solution:
    def checkDistances(self, s: str, distance: List[int]) -> bool:
        visited = []
        matched = 0
        for i in range(len(s)):
            if s[i] not in visited:
                visited.append(s[i])
            else:
                continue
            idx = ord(s[i]) - ord('a')
            if len(s) > i + distance[idx] + 1 and s[i] == s[i + distance[idx] + 1]:
                matched += 1
            else:
                return False
        if matched != len(visited) or (matched == len(visited) and len(s) // 2 != matched):
            return False
        return True


ss = Solution()

assert (ss.checkDistances("abaccb", [1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]))
assert not (ss.checkDistances("aa", [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]))
