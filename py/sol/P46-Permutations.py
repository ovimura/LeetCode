

from typing import List


class Solution:
    all_perm = []
    per = []

    def permute(self, nums: List[int]) -> List[List[int]]:
        self.compute_all_permutations(nums, 0, nums.copy())
        return self.all_perm

    def compute_all_permutations(self, lis, l, t):
        if l == len(lis):
            self.all_perm.append(t.copy())
        else:
            for i in range(l, len(lis)):
                t[l], t[i] = t[i], t[l]
                self.compute_all_permutations(lis, l+1, t)
                t[l], t[i] = t[i], t[l]

    def permute1(self, nums: List[int]) -> List[List[int]]:
        perms = []

        def dfs(curr):
            if len(nums) == len(curr):
                perms.append(curr)
                return

            for t in nums:
                if t not in curr:
                    dfs(curr + [t])

        dfs([])
        return perms


ss = Solution()

assert [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]] == (ss.permute1([1, 2, 3]))

ss.compute_all_permutations([1, 2, 3], 0, [1, 2, 3])

assert [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]] == (ss.all_perm)
