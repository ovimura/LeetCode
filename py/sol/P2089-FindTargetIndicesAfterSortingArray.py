from typing import List

import random


class Solution:

    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        r = []
        self.sorting(nums)
        for i in range(len(nums)):
            if nums[i] == target:
                r.append(i)
        self.sorting(r)
        return r

    def sorting(self, A) -> List[int]:
        for i in range(1, len(A)):
            x = A[i]
            j = i-1
            while A[j] > x and j >= 0:
                A[j+1] = A[j]
                j = j - 1
            A[j+1] = x
        return A


s = Solution()


A = [2, 3, 5, 1]
AA = [2, 2, 3, 5, 1, 1]

random.shuffle(A)
random.shuffle(AA)

assert [1, 2, 3, 5] == (s.sorting(A))
assert [1, 1, 2, 2, 3, 5] == (s.sorting(AA))

assert [1, 2] == s.targetIndices([1, 2, 5, 2, 3], 2)
assert [3] == s.targetIndices([1, 2, 5, 2, 3], 3)
assert [4] == s.targetIndices([1, 2, 5, 2, 3], 5)
