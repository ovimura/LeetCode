from typing import List

# Reference: https://medium.com/theleanprogrammer/best-time-to-buy-and-sell-stock-c4ff30e56e4e
class Solution:

    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        min_price = 100000
        for i in range(len(prices)):
            min_price = min(min_price, prices[i])
            max_profit = max(max_profit, prices[i]-min_price)
        return max_profit


s = Solution()

tt = s.maxProfit([7, 1, 5, 3, 6, 4])

assert 5 == tt
