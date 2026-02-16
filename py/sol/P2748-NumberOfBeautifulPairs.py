class Solution:
    def gcd(self, x, y) -> int:
        while y != 0:
            x, y = y, x % y
        return x

    def countBeautifulPairs(self, nums: list[int]) -> int:
        def first_digit(x: int) -> int:
            while x >= 10:
                x //= 10
            return x

        def last_digit(x: int) -> int:
            return x % 10

        r = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if self.gcd(first_digit(nums[i]), last_digit(nums[j])) == 1:
                    r += 1
        return r


s = Solution()

assert 5 == (s.countBeautifulPairs([2, 5, 1, 4]))