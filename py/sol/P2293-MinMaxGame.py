from typing import List


class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
        while len(nums) > 1:
            newNums = [0]*int(len(nums)/2)
            for i in range(int(len(nums)/2)):
                if i % 2 == 0:
                    newNums[i] = min(nums[2 * i], nums[2 * i + 1])
                else:
                    newNums[i] = max(nums[2 * i], nums[2 * i + 1])
            nums = newNums
        return nums[0]


s = Solution()

assert 1 == (s.minMaxGame([1, 3, 5, 2, 4, 8, 2, 2]))
assert 3 == (s.minMaxGame([3]))

