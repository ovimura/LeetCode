

class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        r = 0
        if len(password) >= 8:
            r += 1
        for p in password:
            if p.islower():
                r += 1
                break
        for p in password:
            if p.isupper():
                r += 1
                break
        for p in password:
            if p.isnumeric():
                r += 1
                break
        for p in password:
            if p in "!@#$%^&*()-+":
                r += 1
                break
        not_two_same_chars = 1
        for i in range(1, len(password)):
            if password[i-1] == password[i]:
                break
            elif password[i-1] != password[i]:
                not_two_same_chars += 1
        if not_two_same_chars == len(password):
            r += 1
        if r == 6:
            return True
        return False


s = Solution()

assert (s.strongPasswordCheckerII("IloveLe3tcode!"))
assert not (s.strongPasswordCheckerII("Me+You--IsMyDream"))
assert not (s.strongPasswordCheckerII("1aB!"))
