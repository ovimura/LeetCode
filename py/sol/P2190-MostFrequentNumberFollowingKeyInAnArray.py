from typing import List


class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        r = 0
        freq = {}
        for i in range(len(nums)-1):
            if nums[i] == key:
                if nums[i+1] not in freq.keys():
                    freq[nums[i+1]] = 1
                else:
                    v = freq[nums[i+1]] + 1
                    freq[nums[i + 1]] = v
        mf = -1
        for k in freq.keys():
            if freq[k] > mf:
                mf = freq[k]
                r = k
        return r


s = Solution()

assert 100 == (s.mostFrequent([1, 100, 200, 1, 100], 1))
assert 2 == (s.mostFrequent([2, 2, 2, 2, 3], 2))
assert 2 == (s.mostFrequent([1, 1000, 2], 1000))

