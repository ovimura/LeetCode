from typing import List


class Solution:
    def countElements(self, nums: List[int]) -> int:
        count = 0
        strictly_smaller_and_strictly_greater = {}
        for i in range(len(nums)):
            if nums[i] not in strictly_smaller_and_strictly_greater.keys():
                strictly_smaller_and_strictly_greater[nums[i]] = 0
        for i in range(len(nums)):
            for k in strictly_smaller_and_strictly_greater.keys():
                if nums[i] > k and strictly_smaller_and_strictly_greater[nums[i]] == 0:
                    strictly_smaller_and_strictly_greater[nums[i]] = 1
        for i in range(len(nums)):
            for k in strictly_smaller_and_strictly_greater.keys():
                if nums[i] < k and strictly_smaller_and_strictly_greater[nums[i]] == 1:
                    strictly_smaller_and_strictly_greater[nums[i]] = 2
        for n in nums:
            if strictly_smaller_and_strictly_greater[n] == 2:
                    count += 1
        return count


s = Solution()

assert 2 == (s.countElements([11, 7, 2, 15]))
assert 2 == (s.countElements([-3, 3, 3, 90]))
