

class Solution:
    def convertTime(self, current: str, correct: str) -> int:
        r = 0
        h1 = current[:2]
        h2 = correct[:2]
        m1 = current[3:]
        m2 = correct[3:]
        if int(m1) > int(m2):
            m1 = ((60 - int(m1)) + int(m2)) % 60
            t = 0
            while t < int(m1):
                if int(t) + 15 <= int(m1):
                    t = int(t) + 15
                    r += 1
                elif (int(t) + 5) <= int(m1):
                    t = int(t) + 5
                    r += 1
                elif (int(t) + 1) <= int(m1):
                    t = int(t) + 1
                    r += 1
            while int(h1) + 1 < int(h2):
                h1 = int(h1) + 1
                r += 1
        else:
            while int(h1) < int(h2):
                h1 = int(h1) + 1
                r += 1
            while int(m1) < int(m2):
                if int(m1) + 15 <= int(m2):
                    m1 = int(m1) + 15
                    r += 1
                elif (int(m1) + 5) <= int(m2):
                    m1 = int(m1) + 5
                    r += 1
                elif (int(m1) + 1) <= int(m2):
                    m1 = int(m1) + 1
                    r += 1
        return r


s = Solution()


assert 3 == (s.convertTime("02:30", "04:35"))

assert 1 == (s.convertTime("11:00", "11:01"))

assert 32 == (s.convertTime("00:00", "23:59"))

assert 7 == (s.convertTime("09:41", "10:34"))




