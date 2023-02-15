class Solution:
    def maximumTime(self, time: str) -> str:
        r = ""
        if time[0] == '?':
            if time[1] != '?' and time[1] > '3':
                r = r + '1'
            else:
                r = r + '2'
        else:
            r = r + time[0]
        if time[1] == '?':
            if r[0] != '?' and r[0] == '0':
                r = r + '9'
            elif r[0] != '?' and r[0] == '1':
                r = r + '9'
            else:
                r = r + '3'
        else:
            r = r + time[1]
        r += ":"
        if time[3] == '?':
            r = r + '5'
        else:
            r = r + time[3]
        if time[4] == '?':
            r = r + '9'
        else:
            r = r + time[4]
        return r


s = Solution()

assert "23:50" == s.maximumTime("2?:?0")

print(s.maximumTime("0?:?0"))
