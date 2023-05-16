from typing import List


class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        if len(cost) <= 2:
            return sum(cost)
        cost.sort()
        calc_cost = [0]*(len(cost))
        r = 0
        i = len(cost)-2
        while i >= 0:
            calc_cost[i] = (cost[i] + cost[i+1])
            if i - 3 >= 0:
                i -= 3
            elif i - 2 >= 0:
                i -= 2
                calc_cost[i] = cost[i]
                break
            else:
                break
        return sum(calc_cost)


s = Solution()

assert 12 == (s.minimumCost([1, 2, 3, 4, 5]))


