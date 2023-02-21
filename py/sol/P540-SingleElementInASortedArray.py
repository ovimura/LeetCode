from typing import List


class Solution:

    def singleNonDuplicate(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        while left < right:
            mid = left + (right - left) // 2
            if mid % 2 == 0 and nums[mid] == nums[mid + 1]:
                left = mid + 1
            elif mid % 2 == 1 and nums[mid] == nums[mid - 1]:
                left = mid + 1
            else:
                right = mid
        return nums[left]


s = Solution()

assert 2 == s.singleNonDuplicate([1,1,2,3,3,4,4,8,8])

