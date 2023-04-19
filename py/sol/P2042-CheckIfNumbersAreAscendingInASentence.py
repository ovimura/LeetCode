class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        tokens = s.split(' ')
        numbers = []
        for t in tokens:
            if t.isnumeric():
                numbers.append(int(t))
        for i in range(1, len(numbers)):
            if numbers[i-1] >= numbers[i]:
                return False
        return True


sol = Solution()

assert (sol.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"))
assert not (sol.areNumbersAscending("hello world 5 x 5"))
assert not (sol.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"))
