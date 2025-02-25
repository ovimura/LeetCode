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
        return -1

    def distMoney2(self, money: int, children: int) -> int:
        r = 0
        if money < children:
            return -1
        mem = [[0]*8 for _ in range(children)]
        for i in range(children):
            mem[i][0] = 1
            money -= 1
        finish = False
        if money > 0:
            for j in range(children):
                if money <= 0:
                    finish = True
                if finish:
                    break
                for k in range(1, 8):
                    mem[j][k] = 1
                    money -= 1
                    if money == 0:
                        finish = True
                        break
        for i in range(children):
            if sum(mem[i]) == 8:
                r += 1
            if sum(mem[i]) == 4 and i == children-1:
                r -= 1
        if r < 0:
            return 0
        elif money != 0 and r > 0:
            return r-1
        else:
            return r


s = Solution()

assert 1 == (s.distMoney2(13, 3))
assert 1 == (s.distMoney2(14, 7))
