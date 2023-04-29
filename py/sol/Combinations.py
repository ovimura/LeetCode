from typing import List


class Combinations:
    """
        C(n,k) = n!/k!(n-k)!
        P(n,k) = n!/(n-k)!
    """

    def comb_of_n_token_k(self, combinations, data, i, k, combination, z) -> List[List[int]]:
        # if i == len(combination):
        if i == k:
            cp = combination.copy()
            combinations.append(cp[:k])
        else:
            for j in range(i, len(data)):
                combination[i], combination[j] = combination[j], combination[i]
                self.comb_of_n_token_k(combinations, data, i+1, k, combination, i)
                combination[i], combination[j] = combination[j], combination[i]
        return combinations


c = Combinations()
temp = []
c.comb_of_n_token_k(temp, [1, 2, 3, 4], 0, 2, [1, 2, 3, 4], 0)
for t in temp:
    print(t)
