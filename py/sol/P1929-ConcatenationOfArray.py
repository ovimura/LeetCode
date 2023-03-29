from typing import List


class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = [0] * (2*len(nums))
        for i in range(len(nums)):
            ans[i] = nums[i]
            ans[i+(len(nums))] = nums[i]
        return ans


s = Solution()

assert [1, 2, 1, 1, 2, 1] == (s.getConcatenation([1, 2, 1]))

