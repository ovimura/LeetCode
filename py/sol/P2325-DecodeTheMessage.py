

class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        mapping_key = {}
        alphabet = ord('a')
        for k in key:
            if k == ' ' and k not in mapping_key.keys():
                mapping_key[k] = ' '
                continue
            elif k not in mapping_key.keys():
                mapping_key[k] = chr(alphabet)
                alphabet += 1
        r = []
        for m in message:
            if m == ' ':
                r.append(' ')
            else:
                r.append(mapping_key[m])
        return "".join(r)


s = Solution()

assert "this is a secret" == (s.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"))
assert "the five boxing wizards jump quickly" == (s.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"))




