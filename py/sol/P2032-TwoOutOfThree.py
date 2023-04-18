from typing import List


class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        all_nums = set()
        freq = {}
        for n in nums1:
            all_nums.add(n)
        for n in nums2:
            all_nums.add(n)
        for n in nums3:
            all_nums.add(n)

        for a in all_nums:
            if a in nums1:
                if a not in freq.keys():
                    freq[a] = 1
                else:
                    v = freq[a]
                    freq[a] = (v+1)
            if a in nums2:
                if a not in freq.keys():
                    freq[a] = 1
                else:
                    v = freq[a]
                    freq[a] = (v+1)
            if a in nums3:
                if a not in freq.keys():
                    freq[a] = 1
                else:
                    v = freq[a]
                    freq[a] = (v+1)
        r = []
        for k in freq.keys():
            if freq[k] > 1:
                r.append(k)
        return r


s = Solution()

assert [2, 3] == (s.twoOutOfThree([1, 1, 3, 2], [2, 3], [3]))



