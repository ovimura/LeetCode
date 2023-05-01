from typing import List


class Solution:

    def findEvenNumbers_v1(self, digits: List[int]) -> List[int]:
        p = []
        r = []
        self.permute(digits, 0, 3, p)
        for i in p:
            if i[0] != 0 and (i[2] % 2) == 0:
                r.append(i)
        t = set()
        for n in r:
            tt = 0
            for nn in n:
                tt += nn
                tt *= 10
            tt //= 10
            t.add(tt)
        st = list(t)
        self.insertion_sorting(st)
        return st

    def permute(self, nums: List[int], i, k, permutations):
        if i == k:
            c = nums.copy()
            permutations.append(c[:k])
        for j in range(i, len(nums)):
            nums[i], nums[j] = nums[j], nums[i]
            self.permute(nums, i+1, k, permutations)
            nums[i], nums[j] = nums[j], nums[i]

    def insertion_sorting(self, a):
        for i in range(1, len(a)):
            x = a[i]
            j = i - 1
            while a[j] > x and j >= 0:
                a[j+1] = a[j]
                j = j - 1
            j = j + 1
            a[j] = x

    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        digits.sort()
        r = set()
        n = len(digits)
        for i in range(n):
            t1 = digits[i]
            if t1 == 0:
                continue
            for j in range(n):
                if i == j:
                    continue
                t2 = digits[j]
                for k in range(n):
                    if j == k or i == k:
                        continue
                    t3 = digits[k]
                    t = (t1 * 100) + (t2 * 10) + t3
                    if t % 2 != 0:
                        continue
                    r.add(t)
        z = list(r)
        z.sort()
        return z


s = Solution()

rr = s.findEvenNumbers([2, 1, 3, 0])

print(rr)

# assert [102, 120, 130, 132, 210, 230, 302, 310, 312, 320] == rr

# s.findEvenNumbers([2, 1, 3, 0])
