
class Solution:
    def rearrangeCharacters(self, s: str, target: str) -> int:
        if len(s) < len(target):
            return 0
        count_copies = len(s) + 1000
        ds = {}
        dt = {}
        for l in s:
            if l not in ds.keys():
                ds[l] = 1
            else:
                v = ds[l] + 1
                ds[l] = v
        for t in target:
            if t not in dt.keys():
                dt[t] = 1
            else:
                v = dt[t] + 1
                dt[t] = v
        letter_not_in_s = 0
        for k in dt:
            if k in ds.keys():
                if (ds[k] >= dt[k]) and (int(ds[k]/dt[k]) < count_copies):
                    count_copies = int(ds[k]/dt[k])
                elif (ds[k] < dt[k]):
                    letter_not_in_s += 1
            else:
                letter_not_in_s += 1
        if len(s) + 1000 == count_copies:
            return 0
        if letter_not_in_s == 0:
            return count_copies
        else:
            return 0


ss = Solution()

assert 2 == (ss.rearrangeCharacters("ilovecodingonleetcode", "code"))
assert 1 == (ss.rearrangeCharacters("abcba", "abc"))
assert 1 == (ss.rearrangeCharacters("abbaccaddaeea", "aaaaa"))
assert 0 == (ss.rearrangeCharacters("ccccndxxlzerbsrrkvdnlvynxbjtjldsqgevphdlrldyishznryttvuratvwiafiwyjklafesvmcexuacxqgmnokfljxkystcbef",
                             "bvciovnpto"))

