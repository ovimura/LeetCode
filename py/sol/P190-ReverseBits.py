
class Solution:
    def reverseBits(self, n: int) -> int:
        n_str = [i for i in str(bin(n)[2:])]
        if len(n_str) < 32:
            n_str = [0] * (32 - len(n_str)) + n_str
        n_str.reverse()
        r_n = "".join(str(i) for i in n_str)
        return int(r_n, 2)


s = Solution()

assert 3221225472 == s.reverseBits(3)
assert 964176192 == s.reverseBits(43261596)
assert 1073741822 == s.reverseBits(2147483644)
