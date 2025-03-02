from typing import List


class Solution:
    def findKOr(self, nums: List[int], k: int) -> int:
        r = '0'
        b = []
        bb = []
        for i in range(len(nums)):
            b.append(bin(nums[i])[2:])
        max_len = 0
        for i in range(len(b)):
            if max_len < len(b[i]):
                max_len = len(b[i])
        for i in range(max_len):
            c = 0
            for j in range(len(b)):
                print("b[j]: -> " + b[j])
                if b[j][i] == '1':
                    c += 1
            if c >= 4:
                r += '1'
            else:
                r += '0'
            print(r)
        return int(r, 2)


s = Solution()

print(s.findKOr([7, 12, 9, 8, 9, 15], 4))



