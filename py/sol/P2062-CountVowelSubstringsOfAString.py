class Solution:
    def countVowelSubstrings(self, word: str) -> int:
        vowels = ['a', 'e', 'i', 'o', 'u']
        r = 0
        s_comb = []
        for i in range(len(word)):
            for j in range(i, len(word)):
                if len(word[i: j+1]) >= len(vowels):
                    s_comb.append(word[i: j+1])
        for sub_str in s_comb:
            mapping_vowels = {}
            cnt_not_vowels = []
            for c in sub_str:
                if c in vowels:
                    mapping_vowels[c] = 1
                else:
                    cnt_not_vowels.append(c)
            t1 = list(mapping_vowels.keys())
            t1.sort()
            if t1 == vowels and len(cnt_not_vowels) == 0:
                r += 1
        return r


sol = Solution()

assert 2 == (sol.countVowelSubstrings("aeiouu"))
assert 0 == (sol.countVowelSubstrings("unicornarihan"))
assert 7 == (sol.countVowelSubstrings("cuaieuouac"))
assert 4656 == (sol.countVowelSubstrings("uieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieao"))

