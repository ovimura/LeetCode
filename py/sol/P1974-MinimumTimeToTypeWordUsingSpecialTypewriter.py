
class Solution:
    def minTimeToType(self, word: str) -> int:
        alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                    't', 'u', 'v', 'w', 'x', 'y', 'z']
        count_steps = 0
        pointer = 0
        p_l = 0
        p_r = 0
        for w in word:
            count_l = 0
            count_r = 0
            found = False
            for r in range(pointer, 26):
                if alphabet[r] == w:
                    count_r += 1
                    p_r = r
                    found = True
                    break
                else:
                    count_r += 1
            if not found:
                for r in range(pointer):
                    if alphabet[r] == w:
                        count_r += 1
                        p_r = r
                        break
                    else:
                        count_r += 1
            found = False
            for l in range(pointer, -26, -1):
                if alphabet[l] == w:
                    count_l += 1
                    if l < 0:
                        p_l = 26 + l
                    else:
                        p_l = l
                    found = True
                    break
                else:
                    count_l += 1
            if not found:
                for l in range(25, -26, -1):
                    if alphabet[l] == w:
                        count_l += 1
                        if l < 0:
                            p_l = 26 + l
                        else:
                            p_l = l
                        break
                    else:
                        count_l += 1
            t = min(count_l, count_r)
            if t == count_l:
                pointer = p_l
            else:
                pointer = p_r
            tt = min(count_l, count_r)
            count_steps += tt
        return count_steps


s = Solution()

assert 31 == (s.minTimeToType("pdy"))

