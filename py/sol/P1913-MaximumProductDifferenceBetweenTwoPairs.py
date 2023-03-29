from typing import List


class Solution:
    def maxProductDifference_0(self, nums: List[int]) -> int:
        difs = []
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                for x in range(j+1, len(nums)):
                    for y in range(x+1, len(nums)):
                        t1 = abs(nums[i]*nums[j] - nums[x]*nums[y])
                        t2 = abs(nums[i]*nums[x] - nums[j]*nums[y])
                        t3 = abs(nums[x]*nums[j] - nums[i]*nums[y])
                        t = [t1, t2, t3]
                        t.sort()
                        difs.append(t[-1])
        difs.sort()
        return difs[-1]

    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort()
        return (nums[-1]*nums[-2] - nums[0]*nums[1])

# 99207635
# 99207635


s = Solution()

assert 34 == (s.maxProductDifference([5,6,2,7,4]))
assert 99207635 == (s.maxProductDifference([9609,9202,9203,5401,2003,6731,5794,6930,843,4713,9838,5120,5762,1698,9469,8314,3486,2536,7901,3675,1774,5737,9114,6023,1883,4565,9407,3706,7031,9191,9122,431,9978,4382,475,2956,4478,5063,5568,5752,101,2973,2348,9279,6567,1141,2325,503,1504,8692,3525,6164,6879,7433,5586,2579,6063,5106,5315,9300,9769,1392,862,2550,2580,816,1337,4459,7260,6948,7958,9947,7243,6786,4476,3532,8395,1865,5656,7044,1817,4641,9718,7973,8634,5054,745,3613]))

