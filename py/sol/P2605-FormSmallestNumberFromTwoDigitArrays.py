from typing import List


"""
    Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit 
    from each array.
    
    
    Example 1:
    
    Input: nums1 = [4,1,3], nums2 = [5,7]
    Output: 15
    Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
    Example 2:
    
    Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
    Output: 3
    Explanation: The number 3 contains the digit 3 which exists in both arrays.
     
    
    Constraints:
    
    1 <= nums1.length, nums2.length <= 9
    1 <= nums1[i], nums2[i] <= 9
    All digits in each array are unique.
"""


class Solution:
    def minNumber(self, nums1: List[int], nums2: List[int]) -> int:
        r = 0
        nums1.sort()
        nums2.sort()
        common_digits = []
        for n1 in nums1:
            if n1 in nums2:
                common_digits.append(n1)
        if len(common_digits) != 0:
            common_digits.sort()
            r = int(common_digits[0])
        else:
            t = str(min(nums1[0], nums2[0])) + str(max(nums1[0], nums2[0]))
            r = int(t)
        return r


s = Solution()


assert 15 == (s.minNumber([4, 1, 3], [5, 7]))

assert 3 == (s.minNumber([3, 5, 2, 6], [3, 1, 7]))

