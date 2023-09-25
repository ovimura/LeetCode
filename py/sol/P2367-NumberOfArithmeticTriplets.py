from typing import List

class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        t = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                for k in range(len(nums)):
                    if i < j < k:
                        if (nums[j] - nums[i]) == diff and (nums[k] - nums[j]) == diff:
                            t.append((nums[i], nums[j], nums[k]))
        tt = set()
        for a in t:
            tt.add(a)
        return len(tt)


s = Solution()


assert 2 == (s.arithmeticTriplets([0,1,4,6,7,10], 3))

