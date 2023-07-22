from typing import List


class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        intersection = set()
        c = 0
        for i in range(len(nums[0])):
            c = 1
            for j in range(1, len(nums)):
                if nums[0][i] in nums[j]:
                    c += 1
            if c == len(nums):
                intersection.add(nums[0][i])
        intersection = list(intersection)
        intersection.sort()
        return intersection


s = Solution()

assert [3, 4] == (s.intersection([[3, 1, 2, 4, 5], [1, 2, 3, 4], [3, 4, 5, 6]]))

