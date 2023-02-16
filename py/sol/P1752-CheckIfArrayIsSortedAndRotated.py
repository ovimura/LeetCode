from typing import List


class Solution:
    def check(self, nums: List[int]) -> bool:
        b = [0]*len(nums)
        for i in range(len(nums)):
            b[i] = nums[i]
        b.sort()
        for i in range(len(nums)):
            count = 0
            for j in range(len(nums)):
                if nums[j] == b[(j+i) % len(nums)]:
                    count += 1
            if count == len(nums):
                return True
        return False


sol = Solution()

assert sol.check([3, 4, 5, 1, 2])
