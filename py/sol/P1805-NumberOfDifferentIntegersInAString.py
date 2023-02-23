class Solution:

    def numDifferentIntegers(self, word: str) -> int:
        numbers = []
        digits = ""
        i = 0
        for w in word:
            if w.isnumeric():
                digits += w
                if i == len(word) - 1:
                    numbers.append(digits)
            else:
                if digits != "":
                    numbers.append(digits)
                digits = ""
            i += 1
        return len(set([int(x) for x in numbers]))


s = Solution()

assert 3 == (s.numDifferentIntegers("a123bc34d8ef34"))

