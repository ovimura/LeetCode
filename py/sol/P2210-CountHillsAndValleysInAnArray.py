from typing import List


class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        hills = 0
        valleys = 0
        i = 1
        in_hill = False
        in_valley = False
        while i < len(nums)-1:
            if nums[i-1] != 0 and (nums[i-1] < nums[i]) and (nums[i] > nums[i+1]) and nums[i+1] != 0:
                hills += 1
                i += 1
            elif nums[i - 1] != 0 and (nums[i - 1] < nums[i]) and (nums[i] == nums[i + 1]) and nums[i + 1] != 0:
                in_hill = True
                i += 1
            elif in_hill and nums[i-1] != 0 and (nums[i-1] == nums[i]) and (nums[i] > nums[i+1]):
                in_hill = False
                hills += 1
                i += 1
            elif nums[i] == nums[i+1]:
                i += 1
            else:
                i += 1
        j = 1
        while j < len(nums)-1:
            if nums[j-1] != 0 and (nums[j-1] > nums[j]) and (nums[j] < nums[j+1]) and nums[j+1] != 0:
                valleys += 1
                j += 1
            elif nums[j - 1] != 0 and (nums[j - 1] > nums[j]) and (nums[j] == nums[j + 1]) and nums[j + 1] != 0:
                in_valley = True
                j += 1
            elif in_valley and nums[j-1] != 0 and (nums[j-1] == nums[j]) and (nums[j] < nums[j+1]):
                in_valley = False
                valleys += 1
                j += 1
            else:
                j += 1
        return hills + valleys


s = Solution()

assert 3 == (s.countHillValley([2, 4, 1, 1, 6, 5]))
assert 0 == (s.countHillValley([6, 6, 5, 5, 4, 1]))
