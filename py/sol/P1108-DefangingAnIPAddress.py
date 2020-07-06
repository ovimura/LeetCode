
class Solution:
    def defangIPaddr(self, address: str) -> str:
        output = []
        for i in range(len(address)):
            if address[i] == '.':
                output.append('[.]')
            else:
                output.append(address[i])
        return "".join(output)


s = Solution().defangIPaddr("1.1.1.1")
print(s)

assert "1[.]1[.]1[.]1" == s

