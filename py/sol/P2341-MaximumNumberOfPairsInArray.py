from typing import List


class Solution:
    def numberOfPairs(self, nums: List[int]) -> List[int]:
        r = [0, 0]
        if len(nums) == 0:
            return [0, 0]
        elif len(nums) == 1:
            return [0, 1]
        while len(nums) != 0:
            n = nums.pop()
            for i in range(len(nums)):
                if nums[i] == n:
                    r[0] += 1
                    nums.pop(i)
                    n = -1
                    break
            if n != -1:
                r[1] += 1
        return r


s = Solution()

assert [3, 1] == (s.numberOfPairs([1, 3, 2, 1, 3, 2, 2]))
assert [0, 1] == (s.numberOfPairs([0]))
assert [1, 0] == (s.numberOfPairs([1, 1]))



