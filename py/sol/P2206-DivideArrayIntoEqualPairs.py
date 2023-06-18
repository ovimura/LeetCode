from typing import List


class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        if len(nums) % 2 != 0:
            return False
        else:
            nums.sort()
            for i in range(0, len(nums), 2):
                if nums[i] != nums[i+1]:
                    return False
        return True


s = Solution()

assert (s.divideArray([3, 2, 3, 2, 2, 2]))

assert not (s.divideArray([1, 2, 3, 4]))
