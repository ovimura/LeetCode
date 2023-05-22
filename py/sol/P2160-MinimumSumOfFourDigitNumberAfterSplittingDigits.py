
class Solution:
    def minimumSum(self, num: int) -> int:
        all_pairs = []
        ns = str(num)
        numbers = [int(x) for x in ns]
        self.gen_all_perm(numbers, 0, all_pairs)
        sum_all_pairs = []
        for x in all_pairs:
            for k in range(1, 4):
                new1 = 0
                for a in x[:k]:
                    new1 += a
                    new1 *= 10
                new1 //= 10
                new2 = 0
                for a in x[k:]:
                    new2 += a
                    new2 *= 10
                new2 //= 10
                sum_all_pairs.append((new1 + new2))
        return min(sum_all_pairs)

    def gen_all_perm(self, num, i, all_paris):
        if i == len(num):
            cp = num.copy()
            all_paris.append(cp)
        for j in range(i, len(num)):
            num[i], num[j] = num[j], num[i]
            self.gen_all_perm(num, i+1, all_paris)
            num[i], num[j] = num[j], num[i]


s = Solution()

assert 52 == (s.minimumSum(2932))
