from typing import List


class Solution:

    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        indexing = {}
        tupleing = []
        for i in range(len(nums)):
            tupleing.append([i, nums[i]])
            if nums[i] not in indexing.keys():
                indexing[nums[i]] = [i]
            else:
                v = indexing[nums[i]]
                v.append(i)
                indexing[nums[i]] = v
        tupleing.sort(key=lambda x: x[1])
        r = [x for x in tupleing[-k:]]
        r.sort(key=lambda x: x[0])
        return [x[1] for x in r]


s = Solution()

assert [-1, 3, 4] == (s.maxSubsequence([-1, -2, 3, 4], 3))
assert [50, -75] == (s.maxSubsequence([50, -75], 2))
