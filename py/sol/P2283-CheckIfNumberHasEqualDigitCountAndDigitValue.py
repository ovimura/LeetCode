

class Solution:
    def digitCount(self, num: str) -> bool:
        freq = {}
        for j in range(len(num)):
            if num[j] not in freq.keys():
                freq[num[j]] = 1
            else:
                v = freq[num[j]] + 1
                freq[num[j]] = v
        for k in range(len(num)):
            if str(k) not in freq.keys():
                freq[str(k)] = 0
        for i in range(len(num)):
            if str(i) in freq.keys():
                if int(num[i]) != freq[str(i)]:
                    return False
        return True


s = Solution()

assert (s.digitCount("1210"))
assert not (s.digitCount("1"))
