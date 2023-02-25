from typing import List


class Solution:

    def maximumPopulation(self, logs: List[List[int]]) -> int:
        s = set()
        for l in logs:
            s.add(l[0])
        lis = list(s)
        lis.sort()
        res = []
        for li in lis:
            for l in logs:
                if li >= l[0] and li < l[1]:
                    res.append((li, l))
        count = []
        for c in res:
            cnt = 0
            for d in res:
                if c[0] == d[0]:
                    cnt += 1
            count.append((cnt, c))
        mm = max([x[0] for x in count])
        r = min([x[1][0] for x in count if x[0] == mm])
        return r


ss = Solution()

assert 1993 == (ss.maximumPopulation([[1993, 1999], [2000, 2010]]))
assert 1960 == (ss.maximumPopulation([[1950,1961],[1960,1971],[1970,1981]]))
assert 1991 == (ss.maximumPopulation([[1966,1968],[1954,2030],[1966,1994],[2030,2044],[1988,2036],[1977,2050],[2036,2046],
                            [1989,2048],[2049,2050],[2008,2019],[2022,2031],[1970,2024],[1957,1996],[1991,2034],
                            [1956,1996],[1959,1969],[2021,2050]]))
