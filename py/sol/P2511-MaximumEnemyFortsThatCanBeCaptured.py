from typing import List


class Solution:
    def captureForts(self, forts: List[int]) -> int:
        ks = []
        for i in range(len(forts)):
            if forts[i] == 1:
                k = 0
                for j in range(i + 1, len(forts)):
                    if forts[j] == 0:
                        k += 1
                        if j == len(forts)-1:
                            k = 0
                    elif forts[j] == -1:
                        break
                    elif forts[j] == 1:
                        k = 0
                        break
                ks.append(k)
        for i in range(len(forts)-1, -1, -1):
            if forts[i] == 1:
                k = 0
                for j in range(i - 1, -1, -1):
                    if forts[j] == 0:
                        k += 1
                        if j == 0:
                            k = 0
                    elif forts[j] == -1:
                        break
                    elif forts[j] == 1:
                        k = 0
                        break
                ks.append(k)
        ks.sort()
        if len(ks)>0:
            return ks[-1]
        else:
            return 0


s = Solution()

assert 4 == (s.captureForts([1,0,0,-1,0,0,0,0,1]))
assert 0 == (s.captureForts([0,0,1,-1]))
assert 0 == (s.captureForts([0,-1,-1,0,-1]))


