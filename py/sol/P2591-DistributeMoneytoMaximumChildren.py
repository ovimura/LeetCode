class Solution:
    def distMoney(self, money: int, children: int) -> int:
        if money < children:  # Not enough money to give at least $1 per child
            return -1
        max_eight_dollars = min(money // 8, children)  # Maximum possible 8-dollar distributions
        # Special case: If all children get exactly $8 and extra money remains, it's invalid
        if max_eight_dollars == children and money - (8 * children) > 0:
            max_eight_dollars -= 1  # Reduce the count to allow proper distribution
        while max_eight_dollars >= 0:
            remaining_money = money - (max_eight_dollars * 8)
            remaining_children = children - max_eight_dollars
            # Ensure remaining money is distributable among remaining children
            if remaining_money >= remaining_children and (remaining_money != 4 or remaining_children > 1):
                return max_eight_dollars
            max_eight_dollars -= 1  # Reduce 8-dollar count and retry
        return -1  # No valid way to distribute


s = Solution()

assert 2 == (s.distMoney(20, 4))
