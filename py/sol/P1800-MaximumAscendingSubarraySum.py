from typing import List


class Solution:

    def maxAscendingSum(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        sums = []
        for i in range(len(nums)-1):
            s = nums[i]
            for j in range(i+1, len(nums)):
                if nums[j-1] < nums[j]:
                    s += nums[j]
                    sums.append(s)
                else:
                    break
        sums.sort(reverse=True)
        nums.sort(reverse=True)
        if len(sums) > 0 and nums[0] < sums[0]:
            return sums[0]
        else:
            return nums[0]


ss = Solution()

assert 65 == (ss.maxAscendingSum([10, 20, 30, 5, 10, 50]))
