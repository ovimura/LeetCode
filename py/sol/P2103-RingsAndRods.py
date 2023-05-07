

class Solution:

    def countPoints(self, rings: str) -> int:
        rods = {}
        n = len(rings) // 2
        for i in range(n+1):
            rods[i] = []
        for r in range(0, len(rings)+1, 2):
            idx = rings[r-1:r]
            if idx == "":
                continue
            if int(idx) in rods.keys():
                v = rods[int(idx)]
                v.append(rings[r-2:r-1])
                rods[int(idx)] = v
            else:
                v = []
                v.append(rings[r-2:r-1])
                rods[int(idx)] = v
        count = []
        for k in rods.keys():
            if 'R' in rods[k] and 'G' in rods[k] and 'B' in rods[k]:
                count.append(k)
        return len(count)


sol = Solution()

assert 1 == (sol.countPoints("R1G1B1"))

