from typing import List


class Solution:
    def canBeIncreasing(self, nums: List[int]) -> bool:
        count_not_increasing = 0
        if len(nums) <= 2:
            return True
        elif len(nums) == 3:
            if nums[0] < nums[1] or nums[0] < nums[2] or nums[1] < nums[2]:
                return True
            else:
                return False
        temp = nums.copy()
        if self.strictly_increasing(temp):
            return True
        else:
            while count_not_increasing < 2:
                for i in range(1, len(temp)):
                    if temp[i-1] >= temp[i]:
                        if count_not_increasing > 0:
                            return False
                        a = temp[:i]
                        b = temp[i+1:]
                        t = a + b
                        if self.strictly_increasing(t):
                            return True
                        else:
                            c = temp[:i-1]
                            d = temp[i:]
                            e = c + d
                            if self.strictly_increasing(e):
                                return True
                            else:
                                temp = t
                                count_not_increasing+=1
                                break
            if count_not_increasing < 2:
                return True
            else:
                return False

    def strictly_increasing(self, arr):
        for i in range(1, len(arr)):
            if arr[i-1] >= arr[i]:
                return False
        return True


s = Solution()

assert (s.canBeIncreasing([1,2, 10, 5,7]))
assert not (s.canBeIncreasing([2, 3, 1, 2]))
assert not (s.canBeIncreasing([89,384,691,680,111,756]))
assert (s.canBeIncreasing([105,924,32,968]))
assert (s.canBeIncreasing([168,403,502,534,798,861]))
