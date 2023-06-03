from typing import List


class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        r = []
        odd = []
        even = []
        for i in range(len(nums)):
            if i % 2 == 0:
                even.append(nums[i])
            else:
                odd.append(nums[i])
        odd.sort(reverse=True)
        even.sort(reverse=False)
        for i in range(len(nums)):
            if i % 2 == 0:
                if len(even) > 0:
                    r.append(even.pop(0))
            else:
                if len(odd) > 0:
                    r.append(odd.pop(0))
        return r


s = Solution()

assert [2, 3, 4, 1] == (s.sortEvenOdd([4, 1, 2, 3]))

