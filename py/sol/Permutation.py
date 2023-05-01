from typing import List


class Permutation:
    """
        C(n,k) = n!/k!(n-k)!
        P(n,k) = n!/(n-k)!
    """

    def perm_of_n_token_k(self, combinations, data, i, k, combination, z) -> List[List[int]]:
        # if i == len(combination):
        if i == k:
            cp = combination.copy()
            combinations.append(cp[:k])
        else:
            for j in range(i, len(data)):
                combination[i], combination[j] = combination[j], combination[i]
                self.perm_of_n_token_k(combinations, data, i+1, k, combination, i)
                combination[i], combination[j] = combination[j], combination[i]
        return combinations


c = Permutation()
temp = []
# c.perm_of_n_token_k(temp, [1, 2, 3, 4], 0, 3, [1, 2, 3, 4], 0)
c.perm_of_n_token_k(temp, [2, 2, 8, 8, 2], 0, 3, [2, 2, 8, 8, 2], 0)
for t in temp:
    print(t)

